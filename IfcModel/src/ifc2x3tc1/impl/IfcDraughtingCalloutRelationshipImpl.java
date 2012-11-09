/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDraughtingCallout;
import ifc2x3tc1.IfcDraughtingCalloutRelationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Draughting Callout Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDraughtingCalloutRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDraughtingCalloutRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDraughtingCalloutRelationshipImpl#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDraughtingCalloutRelationshipImpl#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDraughtingCalloutRelationshipImpl extends EObjectImpl implements IfcDraughtingCalloutRelationship {
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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

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
	 * The cached value of the '{@link #getRelatingDraughtingCallout() <em>Relating Draughting Callout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingDraughtingCallout()
	 * @generated
	 * @ordered
	 */
	protected IfcDraughtingCallout relatingDraughtingCallout;

	/**
	 * The cached value of the '{@link #getRelatedDraughtingCallout() <em>Related Draughting Callout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDraughtingCallout()
	 * @generated
	 * @ordered
	 */
	protected IfcDraughtingCallout relatedDraughtingCallout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDraughtingCalloutRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDraughtingCalloutRelationship();
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
	public IfcDraughtingCallout getRelatingDraughtingCallout() {
		if (relatingDraughtingCallout != null && relatingDraughtingCallout.eIsProxy()) {
			InternalEObject oldRelatingDraughtingCallout = (InternalEObject)relatingDraughtingCallout;
			relatingDraughtingCallout = (IfcDraughtingCallout)eResolveProxy(oldRelatingDraughtingCallout);
			if (relatingDraughtingCallout != oldRelatingDraughtingCallout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT, oldRelatingDraughtingCallout, relatingDraughtingCallout));
			}
		}
		return relatingDraughtingCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingCallout basicGetRelatingDraughtingCallout() {
		return relatingDraughtingCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingDraughtingCallout(IfcDraughtingCallout newRelatingDraughtingCallout, NotificationChain msgs) {
		IfcDraughtingCallout oldRelatingDraughtingCallout = relatingDraughtingCallout;
		relatingDraughtingCallout = newRelatingDraughtingCallout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT, oldRelatingDraughtingCallout, newRelatingDraughtingCallout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingDraughtingCallout(IfcDraughtingCallout newRelatingDraughtingCallout) {
		if (newRelatingDraughtingCallout != relatingDraughtingCallout) {
			NotificationChain msgs = null;
			if (relatingDraughtingCallout != null)
				msgs = ((InternalEObject)relatingDraughtingCallout).eInverseRemove(this, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_TO_CALLOUT, IfcDraughtingCallout.class, msgs);
			if (newRelatingDraughtingCallout != null)
				msgs = ((InternalEObject)newRelatingDraughtingCallout).eInverseAdd(this, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_TO_CALLOUT, IfcDraughtingCallout.class, msgs);
			msgs = basicSetRelatingDraughtingCallout(newRelatingDraughtingCallout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT, newRelatingDraughtingCallout, newRelatingDraughtingCallout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingCallout getRelatedDraughtingCallout() {
		if (relatedDraughtingCallout != null && relatedDraughtingCallout.eIsProxy()) {
			InternalEObject oldRelatedDraughtingCallout = (InternalEObject)relatedDraughtingCallout;
			relatedDraughtingCallout = (IfcDraughtingCallout)eResolveProxy(oldRelatedDraughtingCallout);
			if (relatedDraughtingCallout != oldRelatedDraughtingCallout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT, oldRelatedDraughtingCallout, relatedDraughtingCallout));
			}
		}
		return relatedDraughtingCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingCallout basicGetRelatedDraughtingCallout() {
		return relatedDraughtingCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedDraughtingCallout(IfcDraughtingCallout newRelatedDraughtingCallout, NotificationChain msgs) {
		IfcDraughtingCallout oldRelatedDraughtingCallout = relatedDraughtingCallout;
		relatedDraughtingCallout = newRelatedDraughtingCallout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT, oldRelatedDraughtingCallout, newRelatedDraughtingCallout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedDraughtingCallout(IfcDraughtingCallout newRelatedDraughtingCallout) {
		if (newRelatedDraughtingCallout != relatedDraughtingCallout) {
			NotificationChain msgs = null;
			if (relatedDraughtingCallout != null)
				msgs = ((InternalEObject)relatedDraughtingCallout).eInverseRemove(this, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_FROM_CALLOUT, IfcDraughtingCallout.class, msgs);
			if (newRelatedDraughtingCallout != null)
				msgs = ((InternalEObject)newRelatedDraughtingCallout).eInverseAdd(this, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_FROM_CALLOUT, IfcDraughtingCallout.class, msgs);
			msgs = basicSetRelatedDraughtingCallout(newRelatedDraughtingCallout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT, newRelatedDraughtingCallout, newRelatedDraughtingCallout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				if (relatingDraughtingCallout != null)
					msgs = ((InternalEObject)relatingDraughtingCallout).eInverseRemove(this, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_TO_CALLOUT, IfcDraughtingCallout.class, msgs);
				return basicSetRelatingDraughtingCallout((IfcDraughtingCallout)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
				if (relatedDraughtingCallout != null)
					msgs = ((InternalEObject)relatedDraughtingCallout).eInverseRemove(this, Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT__IS_RELATED_FROM_CALLOUT, IfcDraughtingCallout.class, msgs);
				return basicSetRelatedDraughtingCallout((IfcDraughtingCallout)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				return basicSetRelatingDraughtingCallout(null, msgs);
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
				return basicSetRelatedDraughtingCallout(null, msgs);
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				if (resolve) return getRelatingDraughtingCallout();
				return basicGetRelatingDraughtingCallout();
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
				if (resolve) return getRelatedDraughtingCallout();
				return basicGetRelatedDraughtingCallout();
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				setRelatingDraughtingCallout((IfcDraughtingCallout)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
				setRelatedDraughtingCallout((IfcDraughtingCallout)newValue);
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				setRelatingDraughtingCallout((IfcDraughtingCallout)null);
				return;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
				setRelatedDraughtingCallout((IfcDraughtingCallout)null);
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
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				return relatingDraughtingCallout != null;
			case Ifc2x3tc1Package.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
				return relatedDraughtingCallout != null;
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
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcDraughtingCalloutRelationshipImpl
