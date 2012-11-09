/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorRole;
import ifc2x3tc1.IfcAddress;
import ifc2x3tc1.IfcOrganization;
import ifc2x3tc1.IfcOrganizationRelationship;
import ifc2x3tc1.IfcPersonAndOrganization;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationImpl#getId <em>Id</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationImpl#getIsRelatedBy <em>Is Related By</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationImpl#getRelates <em>Relates</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationImpl#getEngages <em>Engages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOrganizationImpl extends EObjectImpl implements IfcOrganization {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

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
	 * The cached value of the '{@link #getIsRelatedBy() <em>Is Related By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcOrganizationRelationship> isRelatedBy;

	/**
	 * The cached value of the '{@link #getRelates() <em>Relates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelates()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcOrganizationRelationship> relates;

	/**
	 * The cached value of the '{@link #getEngages() <em>Engages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngages()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPersonAndOrganization> engages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcOrganization();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ORGANIZATION__ID, oldId, id, !oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ORGANIZATION__ID, oldId, ID_EDEFAULT, oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ORGANIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ORGANIZATION__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ORGANIZATION__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcActorRole> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList.Unsettable<IfcActorRole>(IfcActorRole.class, this, Ifc2x3tc1Package.IFC_ORGANIZATION__ROLES);
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
			addresses = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcAddress>(IfcAddress.class, this, Ifc2x3tc1Package.IFC_ORGANIZATION__ADDRESSES, Ifc2x3tc1Package.IFC_ADDRESS__OF_ORGANIZATION);
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
	public EList<IfcOrganizationRelationship> getIsRelatedBy() {
		if (isRelatedBy == null) {
			isRelatedBy = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcOrganizationRelationship>(IfcOrganizationRelationship.class, this, Ifc2x3tc1Package.IFC_ORGANIZATION__IS_RELATED_BY, Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS);
		}
		return isRelatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRelatedBy() {
		if (isRelatedBy != null) ((InternalEList.Unsettable<?>)isRelatedBy).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRelatedBy() {
		return isRelatedBy != null && ((InternalEList.Unsettable<?>)isRelatedBy).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcOrganizationRelationship> getRelates() {
		if (relates == null) {
			relates = new EObjectWithInverseResolvingEList.Unsettable<IfcOrganizationRelationship>(IfcOrganizationRelationship.class, this, Ifc2x3tc1Package.IFC_ORGANIZATION__RELATES, Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION);
		}
		return relates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelates() {
		if (relates != null) ((InternalEList.Unsettable<?>)relates).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelates() {
		return relates != null && ((InternalEList.Unsettable<?>)relates).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPersonAndOrganization> getEngages() {
		if (engages == null) {
			engages = new EObjectWithInverseResolvingEList.Unsettable<IfcPersonAndOrganization>(IfcPersonAndOrganization.class, this, Ifc2x3tc1Package.IFC_ORGANIZATION__ENGAGES, Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION);
		}
		return engages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEngages() {
		if (engages != null) ((InternalEList.Unsettable<?>)engages).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEngages() {
		return engages != null && ((InternalEList.Unsettable<?>)engages).isSet();
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ADDRESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAddresses()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ORGANIZATION__IS_RELATED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRelatedBy()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ORGANIZATION__RELATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelates()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ENGAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEngages()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ORGANIZATION__IS_RELATED_BY:
				return ((InternalEList<?>)getIsRelatedBy()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ORGANIZATION__RELATES:
				return ((InternalEList<?>)getRelates()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ENGAGES:
				return ((InternalEList<?>)getEngages()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ID:
				return getId();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ROLES:
				return getRoles();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ADDRESSES:
				return getAddresses();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__IS_RELATED_BY:
				return getIsRelatedBy();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__RELATES:
				return getRelates();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ENGAGES:
				return getEngages();
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ID:
				setId((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends IfcActorRole>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends IfcAddress>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__IS_RELATED_BY:
				getIsRelatedBy().clear();
				getIsRelatedBy().addAll((Collection<? extends IfcOrganizationRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__RELATES:
				getRelates().clear();
				getRelates().addAll((Collection<? extends IfcOrganizationRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ENGAGES:
				getEngages().clear();
				getEngages().addAll((Collection<? extends IfcPersonAndOrganization>)newValue);
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ID:
				unsetId();
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ROLES:
				unsetRoles();
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ADDRESSES:
				unsetAddresses();
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__IS_RELATED_BY:
				unsetIsRelatedBy();
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__RELATES:
				unsetRelates();
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ENGAGES:
				unsetEngages();
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ID:
				return isSetId();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_ORGANIZATION__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ROLES:
				return isSetRoles();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ADDRESSES:
				return isSetAddresses();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__IS_RELATED_BY:
				return isSetIsRelatedBy();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__RELATES:
				return isSetRelates();
			case Ifc2x3tc1Package.IFC_ORGANIZATION__ENGAGES:
				return isSetEngages();
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
		result.append(", Name: ");
		result.append(name);
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcOrganizationImpl
