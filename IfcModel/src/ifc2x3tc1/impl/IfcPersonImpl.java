/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorRole;
import ifc2x3tc1.IfcAddress;
import ifc2x3tc1.IfcPerson;
import ifc2x3tc1.IfcPersonAndOrganization;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonImpl#getId <em>Id</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonImpl#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonImpl#getMiddleNames <em>Middle Names</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonImpl#getPrefixTitles <em>Prefix Titles</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonImpl#getSuffixTitles <em>Suffix Titles</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonImpl#getEngagedIn <em>Engaged In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPersonImpl extends EObjectImpl implements IfcPerson {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected String familyName = FAMILY_NAME_EDEFAULT;

	/**
	 * This is true if the Family Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean familyNameESet;

	/**
	 * The default value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected String givenName = GIVEN_NAME_EDEFAULT;

	/**
	 * This is true if the Given Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean givenNameESet;

	/**
	 * The cached value of the '{@link #getMiddleNames() <em>Middle Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> middleNames;

	/**
	 * The cached value of the '{@link #getPrefixTitles() <em>Prefix Titles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixTitles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> prefixTitles;

	/**
	 * The cached value of the '{@link #getSuffixTitles() <em>Suffix Titles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffixTitles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> suffixTitles;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcActorRole> roles;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcAddress> addresses;

	/**
	 * The cached value of the '{@link #getEngagedIn() <em>Engaged In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngagedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPersonAndOrganization> engagedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPerson();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PERSON__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		String oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PERSON__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamilyName(String newFamilyName) {
		String oldFamilyName = familyName;
		familyName = newFamilyName;
		boolean oldFamilyNameESet = familyNameESet;
		familyNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PERSON__FAMILY_NAME, oldFamilyName, familyName, !oldFamilyNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFamilyName() {
		String oldFamilyName = familyName;
		boolean oldFamilyNameESet = familyNameESet;
		familyName = FAMILY_NAME_EDEFAULT;
		familyNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PERSON__FAMILY_NAME, oldFamilyName, FAMILY_NAME_EDEFAULT, oldFamilyNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFamilyName() {
		return familyNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGivenName(String newGivenName) {
		String oldGivenName = givenName;
		givenName = newGivenName;
		boolean oldGivenNameESet = givenNameESet;
		givenNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PERSON__GIVEN_NAME, oldGivenName, givenName, !oldGivenNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGivenName() {
		String oldGivenName = givenName;
		boolean oldGivenNameESet = givenNameESet;
		givenName = GIVEN_NAME_EDEFAULT;
		givenNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PERSON__GIVEN_NAME, oldGivenName, GIVEN_NAME_EDEFAULT, oldGivenNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGivenName() {
		return givenNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMiddleNames() {
		if (middleNames == null) {
			middleNames = new EDataTypeEList.Unsettable<String>(String.class, this, Ifc2x3tc1Package.IFC_PERSON__MIDDLE_NAMES);
		}
		return middleNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMiddleNames() {
		if (middleNames != null) ((InternalEList.Unsettable<?>)middleNames).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMiddleNames() {
		return middleNames != null && ((InternalEList.Unsettable<?>)middleNames).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPrefixTitles() {
		if (prefixTitles == null) {
			prefixTitles = new EDataTypeEList.Unsettable<String>(String.class, this, Ifc2x3tc1Package.IFC_PERSON__PREFIX_TITLES);
		}
		return prefixTitles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrefixTitles() {
		if (prefixTitles != null) ((InternalEList.Unsettable<?>)prefixTitles).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrefixTitles() {
		return prefixTitles != null && ((InternalEList.Unsettable<?>)prefixTitles).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSuffixTitles() {
		if (suffixTitles == null) {
			suffixTitles = new EDataTypeEList.Unsettable<String>(String.class, this, Ifc2x3tc1Package.IFC_PERSON__SUFFIX_TITLES);
		}
		return suffixTitles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuffixTitles() {
		if (suffixTitles != null) ((InternalEList.Unsettable<?>)suffixTitles).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuffixTitles() {
		return suffixTitles != null && ((InternalEList.Unsettable<?>)suffixTitles).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcActorRole> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList.Unsettable<IfcActorRole>(IfcActorRole.class, this, Ifc2x3tc1Package.IFC_PERSON__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRoles() {
		if (roles != null) ((InternalEList.Unsettable<?>)roles).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoles() {
		return roles != null && ((InternalEList.Unsettable<?>)roles).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAddress> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcAddress>(IfcAddress.class, this, Ifc2x3tc1Package.IFC_PERSON__ADDRESSES, Ifc2x3tc1Package.IFC_ADDRESS__OF_PERSON);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddresses() {
		if (addresses != null) ((InternalEList.Unsettable<?>)addresses).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddresses() {
		return addresses != null && ((InternalEList.Unsettable<?>)addresses).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPersonAndOrganization> getEngagedIn() {
		if (engagedIn == null) {
			engagedIn = new EObjectWithInverseResolvingEList.Unsettable<IfcPersonAndOrganization>(IfcPersonAndOrganization.class, this, Ifc2x3tc1Package.IFC_PERSON__ENGAGED_IN, Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_PERSON);
		}
		return engagedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEngagedIn() {
		if (engagedIn != null) ((InternalEList.Unsettable<?>)engagedIn).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEngagedIn() {
		return engagedIn != null && ((InternalEList.Unsettable<?>)engagedIn).isSet();
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
			case Ifc2x3tc1Package.IFC_PERSON__ADDRESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAddresses()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PERSON__ENGAGED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEngagedIn()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PERSON__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PERSON__ENGAGED_IN:
				return ((InternalEList<?>)getEngagedIn()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PERSON__ID:
				return getId();
			case Ifc2x3tc1Package.IFC_PERSON__FAMILY_NAME:
				return getFamilyName();
			case Ifc2x3tc1Package.IFC_PERSON__GIVEN_NAME:
				return getGivenName();
			case Ifc2x3tc1Package.IFC_PERSON__MIDDLE_NAMES:
				return getMiddleNames();
			case Ifc2x3tc1Package.IFC_PERSON__PREFIX_TITLES:
				return getPrefixTitles();
			case Ifc2x3tc1Package.IFC_PERSON__SUFFIX_TITLES:
				return getSuffixTitles();
			case Ifc2x3tc1Package.IFC_PERSON__ROLES:
				return getRoles();
			case Ifc2x3tc1Package.IFC_PERSON__ADDRESSES:
				return getAddresses();
			case Ifc2x3tc1Package.IFC_PERSON__ENGAGED_IN:
				return getEngagedIn();
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
			case Ifc2x3tc1Package.IFC_PERSON__ID:
				setId((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PERSON__FAMILY_NAME:
				setFamilyName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PERSON__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PERSON__MIDDLE_NAMES:
				getMiddleNames().clear();
				getMiddleNames().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PERSON__PREFIX_TITLES:
				getPrefixTitles().clear();
				getPrefixTitles().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PERSON__SUFFIX_TITLES:
				getSuffixTitles().clear();
				getSuffixTitles().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PERSON__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends IfcActorRole>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PERSON__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends IfcAddress>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PERSON__ENGAGED_IN:
				getEngagedIn().clear();
				getEngagedIn().addAll((Collection<? extends IfcPersonAndOrganization>)newValue);
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
			case Ifc2x3tc1Package.IFC_PERSON__ID:
				unsetId();
				return;
			case Ifc2x3tc1Package.IFC_PERSON__FAMILY_NAME:
				unsetFamilyName();
				return;
			case Ifc2x3tc1Package.IFC_PERSON__GIVEN_NAME:
				unsetGivenName();
				return;
			case Ifc2x3tc1Package.IFC_PERSON__MIDDLE_NAMES:
				unsetMiddleNames();
				return;
			case Ifc2x3tc1Package.IFC_PERSON__PREFIX_TITLES:
				unsetPrefixTitles();
				return;
			case Ifc2x3tc1Package.IFC_PERSON__SUFFIX_TITLES:
				unsetSuffixTitles();
				return;
			case Ifc2x3tc1Package.IFC_PERSON__ROLES:
				unsetRoles();
				return;
			case Ifc2x3tc1Package.IFC_PERSON__ADDRESSES:
				unsetAddresses();
				return;
			case Ifc2x3tc1Package.IFC_PERSON__ENGAGED_IN:
				unsetEngagedIn();
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
			case Ifc2x3tc1Package.IFC_PERSON__ID:
				return isSetId();
			case Ifc2x3tc1Package.IFC_PERSON__FAMILY_NAME:
				return isSetFamilyName();
			case Ifc2x3tc1Package.IFC_PERSON__GIVEN_NAME:
				return isSetGivenName();
			case Ifc2x3tc1Package.IFC_PERSON__MIDDLE_NAMES:
				return isSetMiddleNames();
			case Ifc2x3tc1Package.IFC_PERSON__PREFIX_TITLES:
				return isSetPrefixTitles();
			case Ifc2x3tc1Package.IFC_PERSON__SUFFIX_TITLES:
				return isSetSuffixTitles();
			case Ifc2x3tc1Package.IFC_PERSON__ROLES:
				return isSetRoles();
			case Ifc2x3tc1Package.IFC_PERSON__ADDRESSES:
				return isSetAddresses();
			case Ifc2x3tc1Package.IFC_PERSON__ENGAGED_IN:
				return isSetEngagedIn();
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
		result.append(" (Id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", FamilyName: ");
		if (familyNameESet) result.append(familyName); else result.append("<unset>");
		result.append(", GivenName: ");
		if (givenNameESet) result.append(givenName); else result.append("<unset>");
		result.append(", MiddleNames: ");
		result.append(middleNames);
		result.append(", PrefixTitles: ");
		result.append(prefixTitles);
		result.append(", SuffixTitles: ");
		result.append(suffixTitles);
		result.append(')');
		return result.toString();
	}

} //IfcPersonImpl
