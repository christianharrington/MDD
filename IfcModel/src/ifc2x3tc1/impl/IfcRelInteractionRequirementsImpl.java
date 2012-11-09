/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRelInteractionRequirements;
import ifc2x3tc1.IfcSpaceProgram;
import ifc2x3tc1.IfcSpatialStructureElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Interaction Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelInteractionRequirementsImpl#getDailyInteraction <em>Daily Interaction</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelInteractionRequirementsImpl#getDailyInteractionAsString <em>Daily Interaction As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelInteractionRequirementsImpl#getImportanceRating <em>Importance Rating</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelInteractionRequirementsImpl#getImportanceRatingAsString <em>Importance Rating As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelInteractionRequirementsImpl#getLocationOfInteraction <em>Location Of Interaction</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelInteractionRequirementsImpl#getRelatedSpaceProgram <em>Related Space Program</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelInteractionRequirementsImpl#getRelatingSpaceProgram <em>Relating Space Program</em>}</li>
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
	protected static final double DAILY_INTERACTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDailyInteraction() <em>Daily Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyInteraction()
	 * @generated
	 * @ordered
	 */
	protected double dailyInteraction = DAILY_INTERACTION_EDEFAULT;

	/**
	 * This is true if the Daily Interaction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dailyInteractionESet;

	/**
	 * The default value of the '{@link #getDailyInteractionAsString() <em>Daily Interaction As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyInteractionAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DAILY_INTERACTION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDailyInteractionAsString() <em>Daily Interaction As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyInteractionAsString()
	 * @generated
	 * @ordered
	 */
	protected String dailyInteractionAsString = DAILY_INTERACTION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Daily Interaction As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dailyInteractionAsStringESet;

	/**
	 * The default value of the '{@link #getImportanceRating() <em>Importance Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceRating()
	 * @generated
	 * @ordered
	 */
	protected static final double IMPORTANCE_RATING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getImportanceRating() <em>Importance Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceRating()
	 * @generated
	 * @ordered
	 */
	protected double importanceRating = IMPORTANCE_RATING_EDEFAULT;

	/**
	 * This is true if the Importance Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean importanceRatingESet;

	/**
	 * The default value of the '{@link #getImportanceRatingAsString() <em>Importance Rating As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceRatingAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTANCE_RATING_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportanceRatingAsString() <em>Importance Rating As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceRatingAsString()
	 * @generated
	 * @ordered
	 */
	protected String importanceRatingAsString = IMPORTANCE_RATING_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Importance Rating As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean importanceRatingAsStringESet;

	/**
	 * The cached value of the '{@link #getLocationOfInteraction() <em>Location Of Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationOfInteraction()
	 * @generated
	 * @ordered
	 */
	protected IfcSpatialStructureElement locationOfInteraction;

	/**
	 * This is true if the Location Of Interaction reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean locationOfInteractionESet;

	/**
	 * The cached value of the '{@link #getRelatedSpaceProgram() <em>Related Space Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedSpaceProgram()
	 * @generated
	 * @ordered
	 */
	protected IfcSpaceProgram relatedSpaceProgram;

	/**
	 * The cached value of the '{@link #getRelatingSpaceProgram() <em>Relating Space Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingSpaceProgram()
	 * @generated
	 * @ordered
	 */
	protected IfcSpaceProgram relatingSpaceProgram;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelInteractionRequirements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDailyInteraction() {
		return dailyInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyInteraction(double newDailyInteraction) {
		double oldDailyInteraction = dailyInteraction;
		dailyInteraction = newDailyInteraction;
		boolean oldDailyInteractionESet = dailyInteractionESet;
		dailyInteractionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION, oldDailyInteraction, dailyInteraction, !oldDailyInteractionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDailyInteraction() {
		double oldDailyInteraction = dailyInteraction;
		boolean oldDailyInteractionESet = dailyInteractionESet;
		dailyInteraction = DAILY_INTERACTION_EDEFAULT;
		dailyInteractionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION, oldDailyInteraction, DAILY_INTERACTION_EDEFAULT, oldDailyInteractionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDailyInteraction() {
		return dailyInteractionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDailyInteractionAsString() {
		return dailyInteractionAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyInteractionAsString(String newDailyInteractionAsString) {
		String oldDailyInteractionAsString = dailyInteractionAsString;
		dailyInteractionAsString = newDailyInteractionAsString;
		boolean oldDailyInteractionAsStringESet = dailyInteractionAsStringESet;
		dailyInteractionAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION_AS_STRING, oldDailyInteractionAsString, dailyInteractionAsString, !oldDailyInteractionAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDailyInteractionAsString() {
		String oldDailyInteractionAsString = dailyInteractionAsString;
		boolean oldDailyInteractionAsStringESet = dailyInteractionAsStringESet;
		dailyInteractionAsString = DAILY_INTERACTION_AS_STRING_EDEFAULT;
		dailyInteractionAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION_AS_STRING, oldDailyInteractionAsString, DAILY_INTERACTION_AS_STRING_EDEFAULT, oldDailyInteractionAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDailyInteractionAsString() {
		return dailyInteractionAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getImportanceRating() {
		return importanceRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportanceRating(double newImportanceRating) {
		double oldImportanceRating = importanceRating;
		importanceRating = newImportanceRating;
		boolean oldImportanceRatingESet = importanceRatingESet;
		importanceRatingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING, oldImportanceRating, importanceRating, !oldImportanceRatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImportanceRating() {
		double oldImportanceRating = importanceRating;
		boolean oldImportanceRatingESet = importanceRatingESet;
		importanceRating = IMPORTANCE_RATING_EDEFAULT;
		importanceRatingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING, oldImportanceRating, IMPORTANCE_RATING_EDEFAULT, oldImportanceRatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportanceRating() {
		return importanceRatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportanceRatingAsString() {
		return importanceRatingAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportanceRatingAsString(String newImportanceRatingAsString) {
		String oldImportanceRatingAsString = importanceRatingAsString;
		importanceRatingAsString = newImportanceRatingAsString;
		boolean oldImportanceRatingAsStringESet = importanceRatingAsStringESet;
		importanceRatingAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING_AS_STRING, oldImportanceRatingAsString, importanceRatingAsString, !oldImportanceRatingAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImportanceRatingAsString() {
		String oldImportanceRatingAsString = importanceRatingAsString;
		boolean oldImportanceRatingAsStringESet = importanceRatingAsStringESet;
		importanceRatingAsString = IMPORTANCE_RATING_AS_STRING_EDEFAULT;
		importanceRatingAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING_AS_STRING, oldImportanceRatingAsString, IMPORTANCE_RATING_AS_STRING_EDEFAULT, oldImportanceRatingAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportanceRatingAsString() {
		return importanceRatingAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getLocationOfInteraction() {
		if (locationOfInteraction != null && locationOfInteraction.eIsProxy()) {
			InternalEObject oldLocationOfInteraction = (InternalEObject)locationOfInteraction;
			locationOfInteraction = (IfcSpatialStructureElement)eResolveProxy(oldLocationOfInteraction);
			if (locationOfInteraction != oldLocationOfInteraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION, oldLocationOfInteraction, locationOfInteraction));
			}
		}
		return locationOfInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement basicGetLocationOfInteraction() {
		return locationOfInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationOfInteraction(IfcSpatialStructureElement newLocationOfInteraction) {
		IfcSpatialStructureElement oldLocationOfInteraction = locationOfInteraction;
		locationOfInteraction = newLocationOfInteraction;
		boolean oldLocationOfInteractionESet = locationOfInteractionESet;
		locationOfInteractionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION, oldLocationOfInteraction, locationOfInteraction, !oldLocationOfInteractionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocationOfInteraction() {
		IfcSpatialStructureElement oldLocationOfInteraction = locationOfInteraction;
		boolean oldLocationOfInteractionESet = locationOfInteractionESet;
		locationOfInteraction = null;
		locationOfInteractionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION, oldLocationOfInteraction, null, oldLocationOfInteractionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocationOfInteraction() {
		return locationOfInteractionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgram getRelatedSpaceProgram() {
		if (relatedSpaceProgram != null && relatedSpaceProgram.eIsProxy()) {
			InternalEObject oldRelatedSpaceProgram = (InternalEObject)relatedSpaceProgram;
			relatedSpaceProgram = (IfcSpaceProgram)eResolveProxy(oldRelatedSpaceProgram);
			if (relatedSpaceProgram != oldRelatedSpaceProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM, oldRelatedSpaceProgram, relatedSpaceProgram));
			}
		}
		return relatedSpaceProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgram basicGetRelatedSpaceProgram() {
		return relatedSpaceProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedSpaceProgram(IfcSpaceProgram newRelatedSpaceProgram, NotificationChain msgs) {
		IfcSpaceProgram oldRelatedSpaceProgram = relatedSpaceProgram;
		relatedSpaceProgram = newRelatedSpaceProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM, oldRelatedSpaceProgram, newRelatedSpaceProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSpaceProgram(IfcSpaceProgram newRelatedSpaceProgram) {
		if (newRelatedSpaceProgram != relatedSpaceProgram) {
			NotificationChain msgs = null;
			if (relatedSpaceProgram != null)
				msgs = ((InternalEObject)relatedSpaceProgram).eInverseRemove(this, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_FROM, IfcSpaceProgram.class, msgs);
			if (newRelatedSpaceProgram != null)
				msgs = ((InternalEObject)newRelatedSpaceProgram).eInverseAdd(this, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_FROM, IfcSpaceProgram.class, msgs);
			msgs = basicSetRelatedSpaceProgram(newRelatedSpaceProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM, newRelatedSpaceProgram, newRelatedSpaceProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgram getRelatingSpaceProgram() {
		if (relatingSpaceProgram != null && relatingSpaceProgram.eIsProxy()) {
			InternalEObject oldRelatingSpaceProgram = (InternalEObject)relatingSpaceProgram;
			relatingSpaceProgram = (IfcSpaceProgram)eResolveProxy(oldRelatingSpaceProgram);
			if (relatingSpaceProgram != oldRelatingSpaceProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM, oldRelatingSpaceProgram, relatingSpaceProgram));
			}
		}
		return relatingSpaceProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgram basicGetRelatingSpaceProgram() {
		return relatingSpaceProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingSpaceProgram(IfcSpaceProgram newRelatingSpaceProgram, NotificationChain msgs) {
		IfcSpaceProgram oldRelatingSpaceProgram = relatingSpaceProgram;
		relatingSpaceProgram = newRelatingSpaceProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM, oldRelatingSpaceProgram, newRelatingSpaceProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingSpaceProgram(IfcSpaceProgram newRelatingSpaceProgram) {
		if (newRelatingSpaceProgram != relatingSpaceProgram) {
			NotificationChain msgs = null;
			if (relatingSpaceProgram != null)
				msgs = ((InternalEObject)relatingSpaceProgram).eInverseRemove(this, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_TO, IfcSpaceProgram.class, msgs);
			if (newRelatingSpaceProgram != null)
				msgs = ((InternalEObject)newRelatingSpaceProgram).eInverseAdd(this, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_TO, IfcSpaceProgram.class, msgs);
			msgs = basicSetRelatingSpaceProgram(newRelatingSpaceProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM, newRelatingSpaceProgram, newRelatingSpaceProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				if (relatedSpaceProgram != null)
					msgs = ((InternalEObject)relatedSpaceProgram).eInverseRemove(this, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_FROM, IfcSpaceProgram.class, msgs);
				return basicSetRelatedSpaceProgram((IfcSpaceProgram)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
				if (relatingSpaceProgram != null)
					msgs = ((InternalEObject)relatingSpaceProgram).eInverseRemove(this, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_TO, IfcSpaceProgram.class, msgs);
				return basicSetRelatingSpaceProgram((IfcSpaceProgram)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				return basicSetRelatedSpaceProgram(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
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
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION:
				return getDailyInteraction();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION_AS_STRING:
				return getDailyInteractionAsString();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING:
				return getImportanceRating();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING_AS_STRING:
				return getImportanceRatingAsString();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION:
				if (resolve) return getLocationOfInteraction();
				return basicGetLocationOfInteraction();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				if (resolve) return getRelatedSpaceProgram();
				return basicGetRelatedSpaceProgram();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
				if (resolve) return getRelatingSpaceProgram();
				return basicGetRelatingSpaceProgram();
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
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION:
				setDailyInteraction((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION_AS_STRING:
				setDailyInteractionAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING:
				setImportanceRating((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING_AS_STRING:
				setImportanceRatingAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION:
				setLocationOfInteraction((IfcSpatialStructureElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				setRelatedSpaceProgram((IfcSpaceProgram)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
				setRelatingSpaceProgram((IfcSpaceProgram)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION:
				unsetDailyInteraction();
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION_AS_STRING:
				unsetDailyInteractionAsString();
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING:
				unsetImportanceRating();
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING_AS_STRING:
				unsetImportanceRatingAsString();
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION:
				unsetLocationOfInteraction();
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				setRelatedSpaceProgram((IfcSpaceProgram)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
				setRelatingSpaceProgram((IfcSpaceProgram)null);
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
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION:
				return isSetDailyInteraction();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION_AS_STRING:
				return isSetDailyInteractionAsString();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING:
				return isSetImportanceRating();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING_AS_STRING:
				return isSetImportanceRatingAsString();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__LOCATION_OF_INTERACTION:
				return isSetLocationOfInteraction();
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM:
				return relatedSpaceProgram != null;
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM:
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
		result.append(" (DailyInteraction: ");
		if (dailyInteractionESet) result.append(dailyInteraction); else result.append("<unset>");
		result.append(", DailyInteractionAsString: ");
		if (dailyInteractionAsStringESet) result.append(dailyInteractionAsString); else result.append("<unset>");
		result.append(", ImportanceRating: ");
		if (importanceRatingESet) result.append(importanceRating); else result.append("<unset>");
		result.append(", ImportanceRatingAsString: ");
		if (importanceRatingAsStringESet) result.append(importanceRatingAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcRelInteractionRequirementsImpl
