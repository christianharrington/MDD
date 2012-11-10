/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcOrganization;
import ifc2x3tc1.IfcOrganizationRelationship;

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
 * An implementation of the model object '<em><b>Ifc Organization Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationRelationshipImpl#getRelatingOrganization <em>Relating Organization</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrganizationRelationshipImpl#getRelatedOrganizations <em>Related Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOrganizationRelationshipImpl extends EObjectImpl implements IfcOrganizationRelationship {
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
	 * The cached value of the '{@link #getRelatingOrganization() <em>Relating Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingOrganization()
	 * @generated
	 * @ordered
	 */
	protected IfcOrganization relatingOrganization;

	/**
	 * The cached value of the '{@link #getRelatedOrganizations() <em>Related Organizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcOrganization> relatedOrganizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOrganizationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcOrganizationRelationship();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
	public IfcOrganization getRelatingOrganization() {
		if (relatingOrganization != null && relatingOrganization.eIsProxy()) {
			InternalEObject oldRelatingOrganization = (InternalEObject)relatingOrganization;
			relatingOrganization = (IfcOrganization)eResolveProxy(oldRelatingOrganization);
			if (relatingOrganization != oldRelatingOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION, oldRelatingOrganization, relatingOrganization));
			}
		}
		return relatingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization basicGetRelatingOrganization() {
		return relatingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingOrganization(IfcOrganization newRelatingOrganization, NotificationChain msgs) {
		IfcOrganization oldRelatingOrganization = relatingOrganization;
		relatingOrganization = newRelatingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION, oldRelatingOrganization, newRelatingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingOrganization(IfcOrganization newRelatingOrganization) {
		if (newRelatingOrganization != relatingOrganization) {
			NotificationChain msgs = null;
			if (relatingOrganization != null)
				msgs = ((InternalEObject)relatingOrganization).eInverseRemove(this, Ifc2x3tc1Package.IFC_ORGANIZATION__RELATES, IfcOrganization.class, msgs);
			if (newRelatingOrganization != null)
				msgs = ((InternalEObject)newRelatingOrganization).eInverseAdd(this, Ifc2x3tc1Package.IFC_ORGANIZATION__RELATES, IfcOrganization.class, msgs);
			msgs = basicSetRelatingOrganization(newRelatingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION, newRelatingOrganization, newRelatingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcOrganization> getRelatedOrganizations() {
		if (relatedOrganizations == null) {
			relatedOrganizations = new EObjectWithInverseResolvingEList.ManyInverse<IfcOrganization>(IfcOrganization.class, this, Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS, Ifc2x3tc1Package.IFC_ORGANIZATION__IS_RELATED_BY);
		}
		return relatedOrganizations;
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				if (relatingOrganization != null)
					msgs = ((InternalEObject)relatingOrganization).eInverseRemove(this, Ifc2x3tc1Package.IFC_ORGANIZATION__RELATES, IfcOrganization.class, msgs);
				return basicSetRelatingOrganization((IfcOrganization)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedOrganizations()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				return basicSetRelatingOrganization(null, msgs);
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				return ((InternalEList<?>)getRelatedOrganizations()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				if (resolve) return getRelatingOrganization();
				return basicGetRelatingOrganization();
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				return getRelatedOrganizations();
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				setRelatingOrganization((IfcOrganization)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				getRelatedOrganizations().clear();
				getRelatedOrganizations().addAll((Collection<? extends IfcOrganization>)newValue);
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				setRelatingOrganization((IfcOrganization)null);
				return;
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				getRelatedOrganizations().clear();
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
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				return relatingOrganization != null;
			case Ifc2x3tc1Package.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				return relatedOrganizations != null && !relatedOrganizations.isEmpty();
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
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcOrganizationRelationshipImpl
