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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDraughtingCalloutRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedDraughtingCalloutType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingDraughtingCalloutType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Draughting Callout Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDraughtingCalloutRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDraughtingCalloutRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDraughtingCalloutRelationshipImpl#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDraughtingCalloutRelationshipImpl#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDraughtingCalloutRelationshipImpl extends EntityImpl implements IfcDraughtingCalloutRelationship {
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
	 * The cached value of the '{@link #getRelatingDraughtingCallout() <em>Relating Draughting Callout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingDraughtingCallout()
	 * @generated
	 * @ordered
	 */
	protected RelatingDraughtingCalloutType relatingDraughtingCallout;

	/**
	 * The cached value of the '{@link #getRelatedDraughtingCallout() <em>Related Draughting Callout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDraughtingCallout()
	 * @generated
	 * @ordered
	 */
	protected RelatedDraughtingCalloutType relatedDraughtingCallout;

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
		return FinalPackage.eINSTANCE.getIfcDraughtingCalloutRelationship();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingDraughtingCalloutType getRelatingDraughtingCallout() {
		return relatingDraughtingCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingDraughtingCallout(RelatingDraughtingCalloutType newRelatingDraughtingCallout, NotificationChain msgs) {
		RelatingDraughtingCalloutType oldRelatingDraughtingCallout = relatingDraughtingCallout;
		relatingDraughtingCallout = newRelatingDraughtingCallout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT, oldRelatingDraughtingCallout, newRelatingDraughtingCallout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingDraughtingCallout(RelatingDraughtingCalloutType newRelatingDraughtingCallout) {
		if (newRelatingDraughtingCallout != relatingDraughtingCallout) {
			NotificationChain msgs = null;
			if (relatingDraughtingCallout != null)
				msgs = ((InternalEObject)relatingDraughtingCallout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT, null, msgs);
			if (newRelatingDraughtingCallout != null)
				msgs = ((InternalEObject)newRelatingDraughtingCallout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT, null, msgs);
			msgs = basicSetRelatingDraughtingCallout(newRelatingDraughtingCallout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT, newRelatingDraughtingCallout, newRelatingDraughtingCallout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedDraughtingCalloutType getRelatedDraughtingCallout() {
		return relatedDraughtingCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedDraughtingCallout(RelatedDraughtingCalloutType newRelatedDraughtingCallout, NotificationChain msgs) {
		RelatedDraughtingCalloutType oldRelatedDraughtingCallout = relatedDraughtingCallout;
		relatedDraughtingCallout = newRelatedDraughtingCallout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT, oldRelatedDraughtingCallout, newRelatedDraughtingCallout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedDraughtingCallout(RelatedDraughtingCalloutType newRelatedDraughtingCallout) {
		if (newRelatedDraughtingCallout != relatedDraughtingCallout) {
			NotificationChain msgs = null;
			if (relatedDraughtingCallout != null)
				msgs = ((InternalEObject)relatedDraughtingCallout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT, null, msgs);
			if (newRelatedDraughtingCallout != null)
				msgs = ((InternalEObject)newRelatedDraughtingCallout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT, null, msgs);
			msgs = basicSetRelatedDraughtingCallout(newRelatedDraughtingCallout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT, newRelatedDraughtingCallout, newRelatedDraughtingCallout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				return basicSetRelatingDraughtingCallout(null, msgs);
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
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
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME:
				return getName();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				return getRelatingDraughtingCallout();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
				return getRelatedDraughtingCallout();
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
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				setRelatingDraughtingCallout((RelatingDraughtingCalloutType)newValue);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
				setRelatedDraughtingCallout((RelatedDraughtingCalloutType)newValue);
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
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				setRelatingDraughtingCallout((RelatingDraughtingCalloutType)null);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
				setRelatedDraughtingCallout((RelatedDraughtingCalloutType)null);
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
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATING_DRAUGHTING_CALLOUT:
				return relatingDraughtingCallout != null;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP__RELATED_DRAUGHTING_CALLOUT:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //IfcDraughtingCalloutRelationshipImpl
