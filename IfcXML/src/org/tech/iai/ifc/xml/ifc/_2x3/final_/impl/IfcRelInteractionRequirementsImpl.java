/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LocationOfInteractionType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedSpaceProgramType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingSpaceProgramType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Interaction Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelInteractionRequirementsImpl#getDailyInteraction <em>Daily Interaction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelInteractionRequirementsImpl#getImportanceRating <em>Importance Rating</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelInteractionRequirementsImpl#getLocationOfInteraction <em>Location Of Interaction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelInteractionRequirementsImpl#getRelatedSpaceProgram <em>Related Space Program</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelInteractionRequirementsImpl#getRelatingSpaceProgram <em>Relating Space Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelInteractionRequirementsImpl extends IfcRelConnectsImpl implements IfcRelInteractionRequirements {
	/**
	 * The default value of the '{@link #getDailyInteraction() <em>Daily Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final Double DAILY_INTERACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDailyInteraction() <em>Daily Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyInteraction()
	 * @generated
	 * @ordered
	 */
	protected Double dailyInteraction = DAILY_INTERACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportanceRating() <em>Importance Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceRating()
	 * @generated
	 * @ordered
	 */
	protected static final Double IMPORTANCE_RATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportanceRating() <em>Importance Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceRating()
	 * @generated
	 * @ordered
	 */
	protected Double importanceRating = IMPORTANCE_RATING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocationOfInteraction() <em>Location Of Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationOfInteraction()
	 * @generated
	 * @ordered
	 */
	protected LocationOfInteractionType locationOfInteraction;

	/**
	 * The cached value of the '{@link #getRelatedSpaceProgram() <em>Related Space Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedSpaceProgram()
	 * @generated
	 * @ordered
	 */
	protected RelatedSpaceProgramType relatedSpaceProgram;

	/**
	 * The cached value of the '{@link #getRelatingSpaceProgram() <em>Relating Space Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingSpaceProgram()
	 * @generated
	 * @ordered
	 */
	protected RelatingSpaceProgramType relatingSpaceProgram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelInteractionRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelInteractionRequirements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDailyInteraction() {
		return dailyInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyInteraction(Double newDailyInteraction) {
		Double oldDailyInteraction = dailyInteraction;
		dailyInteraction = newDailyInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION, oldDailyInteraction, dailyInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getImportanceRating() {
		return importanceRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportanceRating(Double newImportanceRating) {
		Double oldImportanceRating = importanceRating;
		importanceRating = newImportanceRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING, oldImportanceRating, importanceRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationOfInteractionType getLocationOfInteraction() {
		return locationOfInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationOfInteraction(LocationOfInteractionType newLocationOfInteraction, NotificationChain msgs) {
		LocationOfInteractionType oldLocationOfInteraction = locationOfInteraction;
		locationOfInteraction = newLocationOfInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION, oldLocationOfInteraction, newLocationOfInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationOfInteraction(LocationOfInteractionType newLocationOfInteraction) {
		if (newLocationOfInteraction != locationOfInteraction) {
			NotificationChain msgs = null;
			if (locationOfInteraction != null)
				msgs = ((InternalEObject)locationOfInteraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION, null, msgs);
			if (newLocationOfInteraction != null)
				msgs = ((InternalEObject)newLocationOfInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION, null, msgs);
			msgs = basicSetLocationOfInteraction(newLocationOfInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION, newLocationOfInteraction, newLocationOfInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSpaceProgramType getRelatedSpaceProgram() {
		return relatedSpaceProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedSpaceProgram(RelatedSpaceProgramType newRelatedSpaceProgram, NotificationChain msgs) {
		RelatedSpaceProgramType oldRelatedSpaceProgram = relatedSpaceProgram;
		relatedSpaceProgram = newRelatedSpaceProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM, oldRelatedSpaceProgram, newRelatedSpaceProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSpaceProgram(RelatedSpaceProgramType newRelatedSpaceProgram) {
		if (newRelatedSpaceProgram != relatedSpaceProgram) {
			NotificationChain msgs = null;
			if (relatedSpaceProgram != null)
				msgs = ((InternalEObject)relatedSpaceProgram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM, null, msgs);
			if (newRelatedSpaceProgram != null)
				msgs = ((InternalEObject)newRelatedSpaceProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM, null, msgs);
			msgs = basicSetRelatedSpaceProgram(newRelatedSpaceProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM, newRelatedSpaceProgram, newRelatedSpaceProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingSpaceProgramType getRelatingSpaceProgram() {
		return relatingSpaceProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingSpaceProgram(RelatingSpaceProgramType newRelatingSpaceProgram, NotificationChain msgs) {
		RelatingSpaceProgramType oldRelatingSpaceProgram = relatingSpaceProgram;
		relatingSpaceProgram = newRelatingSpaceProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM, oldRelatingSpaceProgram, newRelatingSpaceProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingSpaceProgram(RelatingSpaceProgramType newRelatingSpaceProgram) {
		if (newRelatingSpaceProgram != relatingSpaceProgram) {
			NotificationChain msgs = null;
			if (relatingSpaceProgram != null)
				msgs = ((InternalEObject)relatingSpaceProgram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM, null, msgs);
			if (newRelatingSpaceProgram != null)
				msgs = ((InternalEObject)newRelatingSpaceProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM, null, msgs);
			msgs = basicSetRelatingSpaceProgram(newRelatingSpaceProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM, newRelatingSpaceProgram, newRelatingSpaceProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION:
				return basicSetLocationOfInteraction(null, msgs);
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				return basicSetRelatedSpaceProgram(null, msgs);
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
				return basicSetRelatingSpaceProgram(null, msgs);
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
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION:
				return getDailyInteraction();
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING:
				return getImportanceRating();
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION:
				return getLocationOfInteraction();
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				return getRelatedSpaceProgram();
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
				return getRelatingSpaceProgram();
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
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION:
				setDailyInteraction((Double)newValue);
				return;
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING:
				setImportanceRating((Double)newValue);
				return;
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION:
				setLocationOfInteraction((LocationOfInteractionType)newValue);
				return;
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				setRelatedSpaceProgram((RelatedSpaceProgramType)newValue);
				return;
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
				setRelatingSpaceProgram((RelatingSpaceProgramType)newValue);
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
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION:
				setDailyInteraction(DAILY_INTERACTION_EDEFAULT);
				return;
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING:
				setImportanceRating(IMPORTANCE_RATING_EDEFAULT);
				return;
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION:
				setLocationOfInteraction((LocationOfInteractionType)null);
				return;
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				setRelatedSpaceProgram((RelatedSpaceProgramType)null);
				return;
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
				setRelatingSpaceProgram((RelatingSpaceProgramType)null);
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
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION:
				return DAILY_INTERACTION_EDEFAULT == null ? dailyInteraction != null : !DAILY_INTERACTION_EDEFAULT.equals(dailyInteraction);
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING:
				return IMPORTANCE_RATING_EDEFAULT == null ? importanceRating != null : !IMPORTANCE_RATING_EDEFAULT.equals(importanceRating);
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION:
				return locationOfInteraction != null;
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				return relatedSpaceProgram != null;
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
				return relatingSpaceProgram != null;
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
		result.append(" (dailyInteraction: ");
		result.append(dailyInteraction);
		result.append(", importanceRating: ");
		result.append(importanceRating);
		result.append(')');
		return result.toString();
	}

} //IfcRelInteractionRequirementsImpl
