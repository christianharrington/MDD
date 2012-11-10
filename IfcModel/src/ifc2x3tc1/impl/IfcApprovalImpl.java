/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcApproval;
import ifc2x3tc1.IfcApprovalActorRelationship;
import ifc2x3tc1.IfcApprovalRelationship;
import ifc2x3tc1.IfcDateTimeSelect;

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
 * An implementation of the model object '<em><b>Ifc Approval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalImpl#getApprovalDateTime <em>Approval Date Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalImpl#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalImpl#getApprovalLevel <em>Approval Level</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalImpl#getApprovalQualifier <em>Approval Qualifier</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalImpl#getIsRelatedWith <em>Is Related With</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalImpl#getRelates <em>Relates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApprovalImpl extends EObjectImpl implements IfcApproval {
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
	 * The cached value of the '{@link #getApprovalDateTime() <em>Approval Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDateTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect approvalDateTime;

	/**
	 * The default value of the '{@link #getApprovalStatus() <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalStatus() <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatus()
	 * @generated
	 * @ordered
	 */
	protected String approvalStatus = APPROVAL_STATUS_EDEFAULT;

	/**
	 * This is true if the Approval Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean approvalStatusESet;

	/**
	 * The default value of the '{@link #getApprovalLevel() <em>Approval Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalLevel() <em>Approval Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalLevel()
	 * @generated
	 * @ordered
	 */
	protected String approvalLevel = APPROVAL_LEVEL_EDEFAULT;

	/**
	 * This is true if the Approval Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean approvalLevelESet;

	/**
	 * The default value of the '{@link #getApprovalQualifier() <em>Approval Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalQualifier() <em>Approval Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalQualifier()
	 * @generated
	 * @ordered
	 */
	protected String approvalQualifier = APPROVAL_QUALIFIER_EDEFAULT;

	/**
	 * This is true if the Approval Qualifier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean approvalQualifierESet;

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
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcApprovalActorRelationship> actors;

	/**
	 * The cached value of the '{@link #getIsRelatedWith() <em>Is Related With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedWith()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcApprovalRelationship> isRelatedWith;

	/**
	 * The cached value of the '{@link #getRelates() <em>Relates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelates()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcApprovalRelationship> relates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApprovalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcApproval();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPROVAL__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
	public IfcDateTimeSelect getApprovalDateTime() {
		if (approvalDateTime != null && approvalDateTime.eIsProxy()) {
			InternalEObject oldApprovalDateTime = (InternalEObject)approvalDateTime;
			approvalDateTime = (IfcDateTimeSelect)eResolveProxy(oldApprovalDateTime);
			if (approvalDateTime != oldApprovalDateTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_DATE_TIME, oldApprovalDateTime, approvalDateTime));
			}
		}
		return approvalDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetApprovalDateTime() {
		return approvalDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalDateTime(IfcDateTimeSelect newApprovalDateTime) {
		IfcDateTimeSelect oldApprovalDateTime = approvalDateTime;
		approvalDateTime = newApprovalDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_DATE_TIME, oldApprovalDateTime, approvalDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalStatus() {
		return approvalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalStatus(String newApprovalStatus) {
		String oldApprovalStatus = approvalStatus;
		approvalStatus = newApprovalStatus;
		boolean oldApprovalStatusESet = approvalStatusESet;
		approvalStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_STATUS, oldApprovalStatus, approvalStatus, !oldApprovalStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalStatus() {
		String oldApprovalStatus = approvalStatus;
		boolean oldApprovalStatusESet = approvalStatusESet;
		approvalStatus = APPROVAL_STATUS_EDEFAULT;
		approvalStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_STATUS, oldApprovalStatus, APPROVAL_STATUS_EDEFAULT, oldApprovalStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalStatus() {
		return approvalStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalLevel() {
		return approvalLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalLevel(String newApprovalLevel) {
		String oldApprovalLevel = approvalLevel;
		approvalLevel = newApprovalLevel;
		boolean oldApprovalLevelESet = approvalLevelESet;
		approvalLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_LEVEL, oldApprovalLevel, approvalLevel, !oldApprovalLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalLevel() {
		String oldApprovalLevel = approvalLevel;
		boolean oldApprovalLevelESet = approvalLevelESet;
		approvalLevel = APPROVAL_LEVEL_EDEFAULT;
		approvalLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_LEVEL, oldApprovalLevel, APPROVAL_LEVEL_EDEFAULT, oldApprovalLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalLevel() {
		return approvalLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalQualifier() {
		return approvalQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalQualifier(String newApprovalQualifier) {
		String oldApprovalQualifier = approvalQualifier;
		approvalQualifier = newApprovalQualifier;
		boolean oldApprovalQualifierESet = approvalQualifierESet;
		approvalQualifierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_QUALIFIER, oldApprovalQualifier, approvalQualifier, !oldApprovalQualifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalQualifier() {
		String oldApprovalQualifier = approvalQualifier;
		boolean oldApprovalQualifierESet = approvalQualifierESet;
		approvalQualifier = APPROVAL_QUALIFIER_EDEFAULT;
		approvalQualifierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_QUALIFIER, oldApprovalQualifier, APPROVAL_QUALIFIER_EDEFAULT, oldApprovalQualifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalQualifier() {
		return approvalQualifierESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcApprovalActorRelationship> getActors() {
		if (actors == null) {
			actors = new EObjectWithInverseResolvingEList.Unsettable<IfcApprovalActorRelationship>(IfcApprovalActorRelationship.class, this, Ifc2x3tc1Package.IFC_APPROVAL__ACTORS, Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActors() {
		if (actors != null) ((InternalEList.Unsettable<?>)actors).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActors() {
		return actors != null && ((InternalEList.Unsettable<?>)actors).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcApprovalRelationship> getIsRelatedWith() {
		if (isRelatedWith == null) {
			isRelatedWith = new EObjectWithInverseResolvingEList.Unsettable<IfcApprovalRelationship>(IfcApprovalRelationship.class, this, Ifc2x3tc1Package.IFC_APPROVAL__IS_RELATED_WITH, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL);
		}
		return isRelatedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRelatedWith() {
		if (isRelatedWith != null) ((InternalEList.Unsettable<?>)isRelatedWith).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRelatedWith() {
		return isRelatedWith != null && ((InternalEList.Unsettable<?>)isRelatedWith).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcApprovalRelationship> getRelates() {
		if (relates == null) {
			relates = new EObjectWithInverseResolvingEList.Unsettable<IfcApprovalRelationship>(IfcApprovalRelationship.class, this, Ifc2x3tc1Package.IFC_APPROVAL__RELATES, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_APPROVAL__ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActors()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_APPROVAL__IS_RELATED_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRelatedWith()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_APPROVAL__RELATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelates()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_APPROVAL__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_APPROVAL__IS_RELATED_WITH:
				return ((InternalEList<?>)getIsRelatedWith()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_APPROVAL__RELATES:
				return ((InternalEList<?>)getRelates()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_APPROVAL__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_DATE_TIME:
				if (resolve) return getApprovalDateTime();
				return basicGetApprovalDateTime();
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_STATUS:
				return getApprovalStatus();
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_LEVEL:
				return getApprovalLevel();
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_QUALIFIER:
				return getApprovalQualifier();
			case Ifc2x3tc1Package.IFC_APPROVAL__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_APPROVAL__IDENTIFIER:
				return getIdentifier();
			case Ifc2x3tc1Package.IFC_APPROVAL__ACTORS:
				return getActors();
			case Ifc2x3tc1Package.IFC_APPROVAL__IS_RELATED_WITH:
				return getIsRelatedWith();
			case Ifc2x3tc1Package.IFC_APPROVAL__RELATES:
				return getRelates();
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
			case Ifc2x3tc1Package.IFC_APPROVAL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_DATE_TIME:
				setApprovalDateTime((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_STATUS:
				setApprovalStatus((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_LEVEL:
				setApprovalLevel((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_QUALIFIER:
				setApprovalQualifier((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends IfcApprovalActorRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__IS_RELATED_WITH:
				getIsRelatedWith().clear();
				getIsRelatedWith().addAll((Collection<? extends IfcApprovalRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__RELATES:
				getRelates().clear();
				getRelates().addAll((Collection<? extends IfcApprovalRelationship>)newValue);
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
			case Ifc2x3tc1Package.IFC_APPROVAL__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_DATE_TIME:
				setApprovalDateTime((IfcDateTimeSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_STATUS:
				unsetApprovalStatus();
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_LEVEL:
				unsetApprovalLevel();
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_QUALIFIER:
				unsetApprovalQualifier();
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__ACTORS:
				unsetActors();
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__IS_RELATED_WITH:
				unsetIsRelatedWith();
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL__RELATES:
				unsetRelates();
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
			case Ifc2x3tc1Package.IFC_APPROVAL__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_DATE_TIME:
				return approvalDateTime != null;
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_STATUS:
				return isSetApprovalStatus();
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_LEVEL:
				return isSetApprovalLevel();
			case Ifc2x3tc1Package.IFC_APPROVAL__APPROVAL_QUALIFIER:
				return isSetApprovalQualifier();
			case Ifc2x3tc1Package.IFC_APPROVAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_APPROVAL__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Ifc2x3tc1Package.IFC_APPROVAL__ACTORS:
				return isSetActors();
			case Ifc2x3tc1Package.IFC_APPROVAL__IS_RELATED_WITH:
				return isSetIsRelatedWith();
			case Ifc2x3tc1Package.IFC_APPROVAL__RELATES:
				return isSetRelates();
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
		result.append(" (Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", ApprovalStatus: ");
		if (approvalStatusESet) result.append(approvalStatus); else result.append("<unset>");
		result.append(", ApprovalLevel: ");
		if (approvalLevelESet) result.append(approvalLevel); else result.append("<unset>");
		result.append(", ApprovalQualifier: ");
		if (approvalQualifierESet) result.append(approvalQualifier); else result.append("<unset>");
		result.append(", Name: ");
		result.append(name);
		result.append(", Identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //IfcApprovalImpl
