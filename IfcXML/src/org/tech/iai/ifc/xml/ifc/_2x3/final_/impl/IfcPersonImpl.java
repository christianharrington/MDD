/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AddressesType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPerson;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MiddleNamesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PrefixTitlesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RolesType2;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SuffixTitlesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonImpl#getId1 <em>Id1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonImpl#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonImpl#getMiddleNames <em>Middle Names</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonImpl#getPrefixTitles <em>Prefix Titles</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonImpl#getSuffixTitles <em>Suffix Titles</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonImpl#getAddresses <em>Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPersonImpl extends EntityImpl implements IfcPerson {
	/**
	 * The default value of the '{@link #getId1() <em>Id1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId1()
	 * @generated
	 * @ordered
	 */
	protected static final String ID1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId1() <em>Id1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId1()
	 * @generated
	 * @ordered
	 */
	protected String id1 = ID1_EDEFAULT;

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
	 * The cached value of the '{@link #getMiddleNames() <em>Middle Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleNames()
	 * @generated
	 * @ordered
	 */
	protected MiddleNamesType middleNames;

	/**
	 * The cached value of the '{@link #getPrefixTitles() <em>Prefix Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixTitles()
	 * @generated
	 * @ordered
	 */
	protected PrefixTitlesType prefixTitles;

	/**
	 * The cached value of the '{@link #getSuffixTitles() <em>Suffix Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffixTitles()
	 * @generated
	 * @ordered
	 */
	protected SuffixTitlesType suffixTitles;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected RolesType2 roles;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected AddressesType1 addresses;

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
		return FinalPackage.eINSTANCE.getIfcPerson();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId1() {
		return id1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId1(String newId1) {
		String oldId1 = id1;
		id1 = newId1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__ID1, oldId1, id1));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__FAMILY_NAME, oldFamilyName, familyName));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__GIVEN_NAME, oldGivenName, givenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiddleNamesType getMiddleNames() {
		return middleNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiddleNames(MiddleNamesType newMiddleNames, NotificationChain msgs) {
		MiddleNamesType oldMiddleNames = middleNames;
		middleNames = newMiddleNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__MIDDLE_NAMES, oldMiddleNames, newMiddleNames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiddleNames(MiddleNamesType newMiddleNames) {
		if (newMiddleNames != middleNames) {
			NotificationChain msgs = null;
			if (middleNames != null)
				msgs = ((InternalEObject)middleNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON__MIDDLE_NAMES, null, msgs);
			if (newMiddleNames != null)
				msgs = ((InternalEObject)newMiddleNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON__MIDDLE_NAMES, null, msgs);
			msgs = basicSetMiddleNames(newMiddleNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__MIDDLE_NAMES, newMiddleNames, newMiddleNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixTitlesType getPrefixTitles() {
		return prefixTitles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefixTitles(PrefixTitlesType newPrefixTitles, NotificationChain msgs) {
		PrefixTitlesType oldPrefixTitles = prefixTitles;
		prefixTitles = newPrefixTitles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__PREFIX_TITLES, oldPrefixTitles, newPrefixTitles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefixTitles(PrefixTitlesType newPrefixTitles) {
		if (newPrefixTitles != prefixTitles) {
			NotificationChain msgs = null;
			if (prefixTitles != null)
				msgs = ((InternalEObject)prefixTitles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON__PREFIX_TITLES, null, msgs);
			if (newPrefixTitles != null)
				msgs = ((InternalEObject)newPrefixTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON__PREFIX_TITLES, null, msgs);
			msgs = basicSetPrefixTitles(newPrefixTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__PREFIX_TITLES, newPrefixTitles, newPrefixTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuffixTitlesType getSuffixTitles() {
		return suffixTitles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuffixTitles(SuffixTitlesType newSuffixTitles, NotificationChain msgs) {
		SuffixTitlesType oldSuffixTitles = suffixTitles;
		suffixTitles = newSuffixTitles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__SUFFIX_TITLES, oldSuffixTitles, newSuffixTitles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffixTitles(SuffixTitlesType newSuffixTitles) {
		if (newSuffixTitles != suffixTitles) {
			NotificationChain msgs = null;
			if (suffixTitles != null)
				msgs = ((InternalEObject)suffixTitles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON__SUFFIX_TITLES, null, msgs);
			if (newSuffixTitles != null)
				msgs = ((InternalEObject)newSuffixTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON__SUFFIX_TITLES, null, msgs);
			msgs = basicSetSuffixTitles(newSuffixTitles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__SUFFIX_TITLES, newSuffixTitles, newSuffixTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType2 getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoles(RolesType2 newRoles, NotificationChain msgs) {
		RolesType2 oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__ROLES, oldRoles, newRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(RolesType2 newRoles) {
		if (newRoles != roles) {
			NotificationChain msgs = null;
			if (roles != null)
				msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON__ROLES, null, msgs);
			if (newRoles != null)
				msgs = ((InternalEObject)newRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON__ROLES, null, msgs);
			msgs = basicSetRoles(newRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__ROLES, newRoles, newRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressesType1 getAddresses() {
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddresses(AddressesType1 newAddresses, NotificationChain msgs) {
		AddressesType1 oldAddresses = addresses;
		addresses = newAddresses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__ADDRESSES, oldAddresses, newAddresses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddresses(AddressesType1 newAddresses) {
		if (newAddresses != addresses) {
			NotificationChain msgs = null;
			if (addresses != null)
				msgs = ((InternalEObject)addresses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON__ADDRESSES, null, msgs);
			if (newAddresses != null)
				msgs = ((InternalEObject)newAddresses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON__ADDRESSES, null, msgs);
			msgs = basicSetAddresses(newAddresses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON__ADDRESSES, newAddresses, newAddresses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PERSON__MIDDLE_NAMES:
				return basicSetMiddleNames(null, msgs);
			case FinalPackage.IFC_PERSON__PREFIX_TITLES:
				return basicSetPrefixTitles(null, msgs);
			case FinalPackage.IFC_PERSON__SUFFIX_TITLES:
				return basicSetSuffixTitles(null, msgs);
			case FinalPackage.IFC_PERSON__ROLES:
				return basicSetRoles(null, msgs);
			case FinalPackage.IFC_PERSON__ADDRESSES:
				return basicSetAddresses(null, msgs);
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
			case FinalPackage.IFC_PERSON__ID1:
				return getId1();
			case FinalPackage.IFC_PERSON__FAMILY_NAME:
				return getFamilyName();
			case FinalPackage.IFC_PERSON__GIVEN_NAME:
				return getGivenName();
			case FinalPackage.IFC_PERSON__MIDDLE_NAMES:
				return getMiddleNames();
			case FinalPackage.IFC_PERSON__PREFIX_TITLES:
				return getPrefixTitles();
			case FinalPackage.IFC_PERSON__SUFFIX_TITLES:
				return getSuffixTitles();
			case FinalPackage.IFC_PERSON__ROLES:
				return getRoles();
			case FinalPackage.IFC_PERSON__ADDRESSES:
				return getAddresses();
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
			case FinalPackage.IFC_PERSON__ID1:
				setId1((String)newValue);
				return;
			case FinalPackage.IFC_PERSON__FAMILY_NAME:
				setFamilyName((String)newValue);
				return;
			case FinalPackage.IFC_PERSON__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case FinalPackage.IFC_PERSON__MIDDLE_NAMES:
				setMiddleNames((MiddleNamesType)newValue);
				return;
			case FinalPackage.IFC_PERSON__PREFIX_TITLES:
				setPrefixTitles((PrefixTitlesType)newValue);
				return;
			case FinalPackage.IFC_PERSON__SUFFIX_TITLES:
				setSuffixTitles((SuffixTitlesType)newValue);
				return;
			case FinalPackage.IFC_PERSON__ROLES:
				setRoles((RolesType2)newValue);
				return;
			case FinalPackage.IFC_PERSON__ADDRESSES:
				setAddresses((AddressesType1)newValue);
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
			case FinalPackage.IFC_PERSON__ID1:
				setId1(ID1_EDEFAULT);
				return;
			case FinalPackage.IFC_PERSON__FAMILY_NAME:
				setFamilyName(FAMILY_NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_PERSON__GIVEN_NAME:
				setGivenName(GIVEN_NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_PERSON__MIDDLE_NAMES:
				setMiddleNames((MiddleNamesType)null);
				return;
			case FinalPackage.IFC_PERSON__PREFIX_TITLES:
				setPrefixTitles((PrefixTitlesType)null);
				return;
			case FinalPackage.IFC_PERSON__SUFFIX_TITLES:
				setSuffixTitles((SuffixTitlesType)null);
				return;
			case FinalPackage.IFC_PERSON__ROLES:
				setRoles((RolesType2)null);
				return;
			case FinalPackage.IFC_PERSON__ADDRESSES:
				setAddresses((AddressesType1)null);
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
			case FinalPackage.IFC_PERSON__ID1:
				return ID1_EDEFAULT == null ? id1 != null : !ID1_EDEFAULT.equals(id1);
			case FinalPackage.IFC_PERSON__FAMILY_NAME:
				return FAMILY_NAME_EDEFAULT == null ? familyName != null : !FAMILY_NAME_EDEFAULT.equals(familyName);
			case FinalPackage.IFC_PERSON__GIVEN_NAME:
				return GIVEN_NAME_EDEFAULT == null ? givenName != null : !GIVEN_NAME_EDEFAULT.equals(givenName);
			case FinalPackage.IFC_PERSON__MIDDLE_NAMES:
				return middleNames != null;
			case FinalPackage.IFC_PERSON__PREFIX_TITLES:
				return prefixTitles != null;
			case FinalPackage.IFC_PERSON__SUFFIX_TITLES:
				return suffixTitles != null;
			case FinalPackage.IFC_PERSON__ROLES:
				return roles != null;
			case FinalPackage.IFC_PERSON__ADDRESSES:
				return addresses != null;
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
		result.append(" (id1: ");
		result.append(id1);
		result.append(", familyName: ");
		result.append(familyName);
		result.append(", givenName: ");
		result.append(givenName);
		result.append(')');
		return result.toString();
	}

} //IfcPersonImpl
