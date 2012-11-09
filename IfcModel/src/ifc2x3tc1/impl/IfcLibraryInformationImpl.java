/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCalendarDate;
import ifc2x3tc1.IfcLibraryInformation;
import ifc2x3tc1.IfcLibraryReference;
import ifc2x3tc1.IfcOrganization;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Library Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLibraryInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLibraryInformationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLibraryInformationImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLibraryInformationImpl#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLibraryInformationImpl#getLibraryReference <em>Library Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLibraryInformationImpl extends EObjectImpl implements IfcLibraryInformation {
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
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected IfcOrganization publisher;

	/**
	 * This is true if the Publisher reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean publisherESet;

	/**
	 * The cached value of the '{@link #getVersionDate() <em>Version Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDate()
	 * @generated
	 * @ordered
	 */
	protected IfcCalendarDate versionDate;

	/**
	 * This is true if the Version Date reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionDateESet;

	/**
	 * The cached value of the '{@link #getLibraryReference() <em>Library Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryReference()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcLibraryReference> libraryReference;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcLibraryInformation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__NAME, oldName, name));
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
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (IfcOrganization)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(IfcOrganization newPublisher) {
		IfcOrganization oldPublisher = publisher;
		publisher = newPublisher;
		boolean oldPublisherESet = publisherESet;
		publisherESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__PUBLISHER, oldPublisher, publisher, !oldPublisherESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPublisher() {
		IfcOrganization oldPublisher = publisher;
		boolean oldPublisherESet = publisherESet;
		publisher = null;
		publisherESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__PUBLISHER, oldPublisher, null, oldPublisherESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPublisher() {
		return publisherESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getVersionDate() {
		if (versionDate != null && versionDate.eIsProxy()) {
			InternalEObject oldVersionDate = (InternalEObject)versionDate;
			versionDate = (IfcCalendarDate)eResolveProxy(oldVersionDate);
			if (versionDate != oldVersionDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION_DATE, oldVersionDate, versionDate));
			}
		}
		return versionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate basicGetVersionDate() {
		return versionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionDate(IfcCalendarDate newVersionDate) {
		IfcCalendarDate oldVersionDate = versionDate;
		versionDate = newVersionDate;
		boolean oldVersionDateESet = versionDateESet;
		versionDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION_DATE, oldVersionDate, versionDate, !oldVersionDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersionDate() {
		IfcCalendarDate oldVersionDate = versionDate;
		boolean oldVersionDateESet = versionDateESet;
		versionDate = null;
		versionDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION_DATE, oldVersionDate, null, oldVersionDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersionDate() {
		return versionDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLibraryReference> getLibraryReference() {
		if (libraryReference == null) {
			libraryReference = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcLibraryReference>(IfcLibraryReference.class, this, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE, Ifc2x3tc1Package.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY);
		}
		return libraryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLibraryReference() {
		if (libraryReference != null) ((InternalEList.Unsettable<?>)libraryReference).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLibraryReference() {
		return libraryReference != null && ((InternalEList.Unsettable<?>)libraryReference).isSet();
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
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLibraryReference()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				return ((InternalEList<?>)getLibraryReference()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION:
				return getVersion();
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION_DATE:
				if (resolve) return getVersionDate();
				return basicGetVersionDate();
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				return getLibraryReference();
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
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION:
				setVersion((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__PUBLISHER:
				setPublisher((IfcOrganization)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION_DATE:
				setVersionDate((IfcCalendarDate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				getLibraryReference().clear();
				getLibraryReference().addAll((Collection<? extends IfcLibraryReference>)newValue);
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
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION:
				unsetVersion();
				return;
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__PUBLISHER:
				unsetPublisher();
				return;
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION_DATE:
				unsetVersionDate();
				return;
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				unsetLibraryReference();
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
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION:
				return isSetVersion();
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__PUBLISHER:
				return isSetPublisher();
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__VERSION_DATE:
				return isSetVersionDate();
			case Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				return isSetLibraryReference();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcLibraryInformationImpl
