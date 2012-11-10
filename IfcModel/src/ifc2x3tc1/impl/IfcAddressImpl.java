/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAddress;
import ifc2x3tc1.IfcAddressTypeEnum;
import ifc2x3tc1.IfcOrganization;
import ifc2x3tc1.IfcPerson;

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
 * An implementation of the model object '<em><b>Ifc Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcAddressImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAddressImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAddressImpl#getUserDefinedPurpose <em>User Defined Purpose</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAddressImpl#getOfPerson <em>Of Person</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAddressImpl#getOfOrganization <em>Of Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAddressImpl extends EObjectImpl implements IfcAddress {
	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final IfcAddressTypeEnum PURPOSE_EDEFAULT = IfcAddressTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected IfcAddressTypeEnum purpose = PURPOSE_EDEFAULT;

	/**
	 * This is true if the Purpose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean purposeESet;

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
	 * The default value of the '{@link #getUserDefinedPurpose() <em>User Defined Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedPurpose() <em>User Defined Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedPurpose()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedPurpose = USER_DEFINED_PURPOSE_EDEFAULT;

	/**
	 * This is true if the User Defined Purpose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedPurposeESet;

	/**
	 * The cached value of the '{@link #getOfPerson() <em>Of Person</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPerson> ofPerson;

	/**
	 * The cached value of the '{@link #getOfOrganization() <em>Of Organization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcOrganization> ofOrganization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAddressTypeEnum getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(IfcAddressTypeEnum newPurpose) {
		IfcAddressTypeEnum oldPurpose = purpose;
		purpose = newPurpose == null ? PURPOSE_EDEFAULT : newPurpose;
		boolean oldPurposeESet = purposeESet;
		purposeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ADDRESS__PURPOSE, oldPurpose, purpose, !oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPurpose() {
		IfcAddressTypeEnum oldPurpose = purpose;
		boolean oldPurposeESet = purposeESet;
		purpose = PURPOSE_EDEFAULT;
		purposeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ADDRESS__PURPOSE, oldPurpose, PURPOSE_EDEFAULT, oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPurpose() {
		return purposeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ADDRESS__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ADDRESS__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
	public String getUserDefinedPurpose() {
		return userDefinedPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedPurpose(String newUserDefinedPurpose) {
		String oldUserDefinedPurpose = userDefinedPurpose;
		userDefinedPurpose = newUserDefinedPurpose;
		boolean oldUserDefinedPurposeESet = userDefinedPurposeESet;
		userDefinedPurposeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ADDRESS__USER_DEFINED_PURPOSE, oldUserDefinedPurpose, userDefinedPurpose, !oldUserDefinedPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedPurpose() {
		String oldUserDefinedPurpose = userDefinedPurpose;
		boolean oldUserDefinedPurposeESet = userDefinedPurposeESet;
		userDefinedPurpose = USER_DEFINED_PURPOSE_EDEFAULT;
		userDefinedPurposeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ADDRESS__USER_DEFINED_PURPOSE, oldUserDefinedPurpose, USER_DEFINED_PURPOSE_EDEFAULT, oldUserDefinedPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedPurpose() {
		return userDefinedPurposeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPerson> getOfPerson() {
		if (ofPerson == null) {
			ofPerson = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcPerson>(IfcPerson.class, this, Ifc2x3tc1Package.IFC_ADDRESS__OF_PERSON, Ifc2x3tc1Package.IFC_PERSON__ADDRESSES);
		}
		return ofPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOfPerson() {
		if (ofPerson != null) ((InternalEList.Unsettable<?>)ofPerson).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOfPerson() {
		return ofPerson != null && ((InternalEList.Unsettable<?>)ofPerson).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcOrganization> getOfOrganization() {
		if (ofOrganization == null) {
			ofOrganization = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcOrganization>(IfcOrganization.class, this, Ifc2x3tc1Package.IFC_ADDRESS__OF_ORGANIZATION, Ifc2x3tc1Package.IFC_ORGANIZATION__ADDRESSES);
		}
		return ofOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOfOrganization() {
		if (ofOrganization != null) ((InternalEList.Unsettable<?>)ofOrganization).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOfOrganization() {
		return ofOrganization != null && ((InternalEList.Unsettable<?>)ofOrganization).isSet();
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
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_PERSON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfPerson()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_ORGANIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfOrganization()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_PERSON:
				return ((InternalEList<?>)getOfPerson()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_ORGANIZATION:
				return ((InternalEList<?>)getOfOrganization()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ADDRESS__PURPOSE:
				return getPurpose();
			case Ifc2x3tc1Package.IFC_ADDRESS__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_ADDRESS__USER_DEFINED_PURPOSE:
				return getUserDefinedPurpose();
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_PERSON:
				return getOfPerson();
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_ORGANIZATION:
				return getOfOrganization();
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
			case Ifc2x3tc1Package.IFC_ADDRESS__PURPOSE:
				setPurpose((IfcAddressTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ADDRESS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ADDRESS__USER_DEFINED_PURPOSE:
				setUserDefinedPurpose((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_PERSON:
				getOfPerson().clear();
				getOfPerson().addAll((Collection<? extends IfcPerson>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_ORGANIZATION:
				getOfOrganization().clear();
				getOfOrganization().addAll((Collection<? extends IfcOrganization>)newValue);
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
			case Ifc2x3tc1Package.IFC_ADDRESS__PURPOSE:
				unsetPurpose();
				return;
			case Ifc2x3tc1Package.IFC_ADDRESS__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_ADDRESS__USER_DEFINED_PURPOSE:
				unsetUserDefinedPurpose();
				return;
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_PERSON:
				unsetOfPerson();
				return;
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_ORGANIZATION:
				unsetOfOrganization();
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
			case Ifc2x3tc1Package.IFC_ADDRESS__PURPOSE:
				return isSetPurpose();
			case Ifc2x3tc1Package.IFC_ADDRESS__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_ADDRESS__USER_DEFINED_PURPOSE:
				return isSetUserDefinedPurpose();
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_PERSON:
				return isSetOfPerson();
			case Ifc2x3tc1Package.IFC_ADDRESS__OF_ORGANIZATION:
				return isSetOfOrganization();
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
		result.append(" (Purpose: ");
		if (purposeESet) result.append(purpose); else result.append("<unset>");
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", UserDefinedPurpose: ");
		if (userDefinedPurposeESet) result.append(userDefinedPurpose); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcAddressImpl
