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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOrganizationRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedOrganizationsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingOrganizationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Organization Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOrganizationRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOrganizationRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOrganizationRelationshipImpl#getRelatingOrganization <em>Relating Organization</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOrganizationRelationshipImpl#getRelatedOrganizations <em>Related Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOrganizationRelationshipImpl extends EntityImpl implements IfcOrganizationRelationship {
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
	 * The cached value of the '{@link #getRelatingOrganization() <em>Relating Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingOrganization()
	 * @generated
	 * @ordered
	 */
	protected RelatingOrganizationType relatingOrganization;

	/**
	 * The cached value of the '{@link #getRelatedOrganizations() <em>Related Organizations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedOrganizations()
	 * @generated
	 * @ordered
	 */
	protected RelatedOrganizationsType relatedOrganizations;

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
		return FinalPackage.eINSTANCE.getIfcOrganizationRelationship();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__NAME, oldName, name));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingOrganizationType getRelatingOrganization() {
		return relatingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingOrganization(RelatingOrganizationType newRelatingOrganization, NotificationChain msgs) {
		RelatingOrganizationType oldRelatingOrganization = relatingOrganization;
		relatingOrganization = newRelatingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION, oldRelatingOrganization, newRelatingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingOrganization(RelatingOrganizationType newRelatingOrganization) {
		if (newRelatingOrganization != relatingOrganization) {
			NotificationChain msgs = null;
			if (relatingOrganization != null)
				msgs = ((InternalEObject)relatingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION, null, msgs);
			if (newRelatingOrganization != null)
				msgs = ((InternalEObject)newRelatingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION, null, msgs);
			msgs = basicSetRelatingOrganization(newRelatingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION, newRelatingOrganization, newRelatingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedOrganizationsType getRelatedOrganizations() {
		return relatedOrganizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedOrganizations(RelatedOrganizationsType newRelatedOrganizations, NotificationChain msgs) {
		RelatedOrganizationsType oldRelatedOrganizations = relatedOrganizations;
		relatedOrganizations = newRelatedOrganizations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS, oldRelatedOrganizations, newRelatedOrganizations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedOrganizations(RelatedOrganizationsType newRelatedOrganizations) {
		if (newRelatedOrganizations != relatedOrganizations) {
			NotificationChain msgs = null;
			if (relatedOrganizations != null)
				msgs = ((InternalEObject)relatedOrganizations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS, null, msgs);
			if (newRelatedOrganizations != null)
				msgs = ((InternalEObject)newRelatedOrganizations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS, null, msgs);
			msgs = basicSetRelatedOrganizations(newRelatedOrganizations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS, newRelatedOrganizations, newRelatedOrganizations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				return basicSetRelatingOrganization(null, msgs);
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				return basicSetRelatedOrganizations(null, msgs);
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
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__NAME:
				return getName();
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				return getRelatingOrganization();
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				return getRelatedOrganizations();
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
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				setRelatingOrganization((RelatingOrganizationType)newValue);
				return;
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				setRelatedOrganizations((RelatedOrganizationsType)newValue);
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
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				setRelatingOrganization((RelatingOrganizationType)null);
				return;
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				setRelatedOrganizations((RelatedOrganizationsType)null);
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
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATING_ORGANIZATION:
				return relatingOrganization != null;
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP__RELATED_ORGANIZATIONS:
				return relatedOrganizations != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //IfcOrganizationRelationshipImpl
