/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRelInteractionRequirements;
import ifc2x3tc1.IfcSpaceProgram;
import ifc2x3tc1.IfcSpatialStructureElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceProgramImpl#getSpaceProgramIdentifier <em>Space Program Identifier</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceProgramImpl#getMaxRequiredArea <em>Max Required Area</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceProgramImpl#getMaxRequiredAreaAsString <em>Max Required Area As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceProgramImpl#getMinRequiredArea <em>Min Required Area</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceProgramImpl#getMinRequiredAreaAsString <em>Min Required Area As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceProgramImpl#getRequestedLocation <em>Requested Location</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceProgramImpl#getStandardRequiredArea <em>Standard Required Area</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceProgramImpl#getStandardRequiredAreaAsString <em>Standard Required Area As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceProgramImpl#getHasInteractionReqsFrom <em>Has Interaction Reqs From</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceProgramImpl#getHasInteractionReqsTo <em>Has Interaction Reqs To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSpaceProgramImpl extends IfcControlImpl implements IfcSpaceProgram {
	/**
	 * The default value of the '{@link #getSpaceProgramIdentifier() <em>Space Program Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceProgramIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACE_PROGRAM_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceProgramIdentifier() <em>Space Program Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceProgramIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String spaceProgramIdentifier = SPACE_PROGRAM_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRequiredArea() <em>Max Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequiredArea()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_REQUIRED_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxRequiredArea() <em>Max Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequiredArea()
	 * @generated
	 * @ordered
	 */
	protected double maxRequiredArea = MAX_REQUIRED_AREA_EDEFAULT;

	/**
	 * This is true if the Max Required Area attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxRequiredAreaESet;

	/**
	 * The default value of the '{@link #getMaxRequiredAreaAsString() <em>Max Required Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequiredAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_REQUIRED_AREA_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRequiredAreaAsString() <em>Max Required Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequiredAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected String maxRequiredAreaAsString = MAX_REQUIRED_AREA_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Max Required Area As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxRequiredAreaAsStringESet;

	/**
	 * The default value of the '{@link #getMinRequiredArea() <em>Min Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequiredArea()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_REQUIRED_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinRequiredArea() <em>Min Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequiredArea()
	 * @generated
	 * @ordered
	 */
	protected double minRequiredArea = MIN_REQUIRED_AREA_EDEFAULT;

	/**
	 * This is true if the Min Required Area attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minRequiredAreaESet;

	/**
	 * The default value of the '{@link #getMinRequiredAreaAsString() <em>Min Required Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequiredAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_REQUIRED_AREA_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinRequiredAreaAsString() <em>Min Required Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequiredAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected String minRequiredAreaAsString = MIN_REQUIRED_AREA_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Min Required Area As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minRequiredAreaAsStringESet;

	/**
	 * The cached value of the '{@link #getRequestedLocation() <em>Requested Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedLocation()
	 * @generated
	 * @ordered
	 */
	protected IfcSpatialStructureElement requestedLocation;

	/**
	 * This is true if the Requested Location reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedLocationESet;

	/**
	 * The default value of the '{@link #getStandardRequiredArea() <em>Standard Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRequiredArea()
	 * @generated
	 * @ordered
	 */
	protected static final double STANDARD_REQUIRED_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStandardRequiredArea() <em>Standard Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRequiredArea()
	 * @generated
	 * @ordered
	 */
	protected double standardRequiredArea = STANDARD_REQUIRED_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardRequiredAreaAsString() <em>Standard Required Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRequiredAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_REQUIRED_AREA_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardRequiredAreaAsString() <em>Standard Required Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRequiredAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected String standardRequiredAreaAsString = STANDARD_REQUIRED_AREA_AS_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasInteractionReqsFrom() <em>Has Interaction Reqs From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInteractionReqsFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelInteractionRequirements> hasInteractionReqsFrom;

	/**
	 * The cached value of the '{@link #getHasInteractionReqsTo() <em>Has Interaction Reqs To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInteractionReqsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelInteractionRequirements> hasInteractionReqsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpaceProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpaceProgramIdentifier() {
		return spaceProgramIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceProgramIdentifier(String newSpaceProgramIdentifier) {
		String oldSpaceProgramIdentifier = spaceProgramIdentifier;
		spaceProgramIdentifier = newSpaceProgramIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER, oldSpaceProgramIdentifier, spaceProgramIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxRequiredArea() {
		return maxRequiredArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRequiredArea(double newMaxRequiredArea) {
		double oldMaxRequiredArea = maxRequiredArea;
		maxRequiredArea = newMaxRequiredArea;
		boolean oldMaxRequiredAreaESet = maxRequiredAreaESet;
		maxRequiredAreaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA, oldMaxRequiredArea, maxRequiredArea, !oldMaxRequiredAreaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxRequiredArea() {
		double oldMaxRequiredArea = maxRequiredArea;
		boolean oldMaxRequiredAreaESet = maxRequiredAreaESet;
		maxRequiredArea = MAX_REQUIRED_AREA_EDEFAULT;
		maxRequiredAreaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA, oldMaxRequiredArea, MAX_REQUIRED_AREA_EDEFAULT, oldMaxRequiredAreaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxRequiredArea() {
		return maxRequiredAreaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxRequiredAreaAsString() {
		return maxRequiredAreaAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRequiredAreaAsString(String newMaxRequiredAreaAsString) {
		String oldMaxRequiredAreaAsString = maxRequiredAreaAsString;
		maxRequiredAreaAsString = newMaxRequiredAreaAsString;
		boolean oldMaxRequiredAreaAsStringESet = maxRequiredAreaAsStringESet;
		maxRequiredAreaAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA_AS_STRING, oldMaxRequiredAreaAsString, maxRequiredAreaAsString, !oldMaxRequiredAreaAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxRequiredAreaAsString() {
		String oldMaxRequiredAreaAsString = maxRequiredAreaAsString;
		boolean oldMaxRequiredAreaAsStringESet = maxRequiredAreaAsStringESet;
		maxRequiredAreaAsString = MAX_REQUIRED_AREA_AS_STRING_EDEFAULT;
		maxRequiredAreaAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA_AS_STRING, oldMaxRequiredAreaAsString, MAX_REQUIRED_AREA_AS_STRING_EDEFAULT, oldMaxRequiredAreaAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxRequiredAreaAsString() {
		return maxRequiredAreaAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinRequiredArea() {
		return minRequiredArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequiredArea(double newMinRequiredArea) {
		double oldMinRequiredArea = minRequiredArea;
		minRequiredArea = newMinRequiredArea;
		boolean oldMinRequiredAreaESet = minRequiredAreaESet;
		minRequiredAreaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA, oldMinRequiredArea, minRequiredArea, !oldMinRequiredAreaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinRequiredArea() {
		double oldMinRequiredArea = minRequiredArea;
		boolean oldMinRequiredAreaESet = minRequiredAreaESet;
		minRequiredArea = MIN_REQUIRED_AREA_EDEFAULT;
		minRequiredAreaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA, oldMinRequiredArea, MIN_REQUIRED_AREA_EDEFAULT, oldMinRequiredAreaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinRequiredArea() {
		return minRequiredAreaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinRequiredAreaAsString() {
		return minRequiredAreaAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequiredAreaAsString(String newMinRequiredAreaAsString) {
		String oldMinRequiredAreaAsString = minRequiredAreaAsString;
		minRequiredAreaAsString = newMinRequiredAreaAsString;
		boolean oldMinRequiredAreaAsStringESet = minRequiredAreaAsStringESet;
		minRequiredAreaAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA_AS_STRING, oldMinRequiredAreaAsString, minRequiredAreaAsString, !oldMinRequiredAreaAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinRequiredAreaAsString() {
		String oldMinRequiredAreaAsString = minRequiredAreaAsString;
		boolean oldMinRequiredAreaAsStringESet = minRequiredAreaAsStringESet;
		minRequiredAreaAsString = MIN_REQUIRED_AREA_AS_STRING_EDEFAULT;
		minRequiredAreaAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA_AS_STRING, oldMinRequiredAreaAsString, MIN_REQUIRED_AREA_AS_STRING_EDEFAULT, oldMinRequiredAreaAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinRequiredAreaAsString() {
		return minRequiredAreaAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getRequestedLocation() {
		if (requestedLocation != null && requestedLocation.eIsProxy()) {
			InternalEObject oldRequestedLocation = (InternalEObject)requestedLocation;
			requestedLocation = (IfcSpatialStructureElement)eResolveProxy(oldRequestedLocation);
			if (requestedLocation != oldRequestedLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__REQUESTED_LOCATION, oldRequestedLocation, requestedLocation));
			}
		}
		return requestedLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement basicGetRequestedLocation() {
		return requestedLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedLocation(IfcSpatialStructureElement newRequestedLocation) {
		IfcSpatialStructureElement oldRequestedLocation = requestedLocation;
		requestedLocation = newRequestedLocation;
		boolean oldRequestedLocationESet = requestedLocationESet;
		requestedLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__REQUESTED_LOCATION, oldRequestedLocation, requestedLocation, !oldRequestedLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedLocation() {
		IfcSpatialStructureElement oldRequestedLocation = requestedLocation;
		boolean oldRequestedLocationESet = requestedLocationESet;
		requestedLocation = null;
		requestedLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__REQUESTED_LOCATION, oldRequestedLocation, null, oldRequestedLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedLocation() {
		return requestedLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStandardRequiredArea() {
		return standardRequiredArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardRequiredArea(double newStandardRequiredArea) {
		double oldStandardRequiredArea = standardRequiredArea;
		standardRequiredArea = newStandardRequiredArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA, oldStandardRequiredArea, standardRequiredArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandardRequiredAreaAsString() {
		return standardRequiredAreaAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardRequiredAreaAsString(String newStandardRequiredAreaAsString) {
		String oldStandardRequiredAreaAsString = standardRequiredAreaAsString;
		standardRequiredAreaAsString = newStandardRequiredAreaAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA_AS_STRING, oldStandardRequiredAreaAsString, standardRequiredAreaAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelInteractionRequirements> getHasInteractionReqsFrom() {
		if (hasInteractionReqsFrom == null) {
			hasInteractionReqsFrom = new EObjectWithInverseResolvingEList.Unsettable<IfcRelInteractionRequirements>(IfcRelInteractionRequirements.class, this, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_FROM, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATED_SPACE_PROGRAM);
		}
		return hasInteractionReqsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasInteractionReqsFrom() {
		if (hasInteractionReqsFrom != null) ((InternalEList.Unsettable<?>)hasInteractionReqsFrom).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasInteractionReqsFrom() {
		return hasInteractionReqsFrom != null && ((InternalEList.Unsettable<?>)hasInteractionReqsFrom).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelInteractionRequirements> getHasInteractionReqsTo() {
		if (hasInteractionReqsTo == null) {
			hasInteractionReqsTo = new EObjectWithInverseResolvingEList.Unsettable<IfcRelInteractionRequirements>(IfcRelInteractionRequirements.class, this, Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_TO, Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__RELATING_SPACE_PROGRAM);
		}
		return hasInteractionReqsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasInteractionReqsTo() {
		if (hasInteractionReqsTo != null) ((InternalEList.Unsettable<?>)hasInteractionReqsTo).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasInteractionReqsTo() {
		return hasInteractionReqsTo != null && ((InternalEList.Unsettable<?>)hasInteractionReqsTo).isSet();
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
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasInteractionReqsFrom()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasInteractionReqsTo()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_FROM:
				return ((InternalEList<?>)getHasInteractionReqsFrom()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_TO:
				return ((InternalEList<?>)getHasInteractionReqsTo()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER:
				return getSpaceProgramIdentifier();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA:
				return getMaxRequiredArea();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA_AS_STRING:
				return getMaxRequiredAreaAsString();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA:
				return getMinRequiredArea();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA_AS_STRING:
				return getMinRequiredAreaAsString();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__REQUESTED_LOCATION:
				if (resolve) return getRequestedLocation();
				return basicGetRequestedLocation();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA:
				return getStandardRequiredArea();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA_AS_STRING:
				return getStandardRequiredAreaAsString();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_FROM:
				return getHasInteractionReqsFrom();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_TO:
				return getHasInteractionReqsTo();
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
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER:
				setSpaceProgramIdentifier((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA:
				setMaxRequiredArea((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA_AS_STRING:
				setMaxRequiredAreaAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA:
				setMinRequiredArea((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA_AS_STRING:
				setMinRequiredAreaAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__REQUESTED_LOCATION:
				setRequestedLocation((IfcSpatialStructureElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA:
				setStandardRequiredArea((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA_AS_STRING:
				setStandardRequiredAreaAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_FROM:
				getHasInteractionReqsFrom().clear();
				getHasInteractionReqsFrom().addAll((Collection<? extends IfcRelInteractionRequirements>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_TO:
				getHasInteractionReqsTo().clear();
				getHasInteractionReqsTo().addAll((Collection<? extends IfcRelInteractionRequirements>)newValue);
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
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER:
				setSpaceProgramIdentifier(SPACE_PROGRAM_IDENTIFIER_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA:
				unsetMaxRequiredArea();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA_AS_STRING:
				unsetMaxRequiredAreaAsString();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA:
				unsetMinRequiredArea();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA_AS_STRING:
				unsetMinRequiredAreaAsString();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__REQUESTED_LOCATION:
				unsetRequestedLocation();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA:
				setStandardRequiredArea(STANDARD_REQUIRED_AREA_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA_AS_STRING:
				setStandardRequiredAreaAsString(STANDARD_REQUIRED_AREA_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_FROM:
				unsetHasInteractionReqsFrom();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_TO:
				unsetHasInteractionReqsTo();
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
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER:
				return SPACE_PROGRAM_IDENTIFIER_EDEFAULT == null ? spaceProgramIdentifier != null : !SPACE_PROGRAM_IDENTIFIER_EDEFAULT.equals(spaceProgramIdentifier);
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA:
				return isSetMaxRequiredArea();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA_AS_STRING:
				return isSetMaxRequiredAreaAsString();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA:
				return isSetMinRequiredArea();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA_AS_STRING:
				return isSetMinRequiredAreaAsString();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__REQUESTED_LOCATION:
				return isSetRequestedLocation();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA:
				return standardRequiredArea != STANDARD_REQUIRED_AREA_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA_AS_STRING:
				return STANDARD_REQUIRED_AREA_AS_STRING_EDEFAULT == null ? standardRequiredAreaAsString != null : !STANDARD_REQUIRED_AREA_AS_STRING_EDEFAULT.equals(standardRequiredAreaAsString);
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_FROM:
				return isSetHasInteractionReqsFrom();
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__HAS_INTERACTION_REQS_TO:
				return isSetHasInteractionReqsTo();
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
		result.append(" (SpaceProgramIdentifier: ");
		result.append(spaceProgramIdentifier);
		result.append(", MaxRequiredArea: ");
		if (maxRequiredAreaESet) result.append(maxRequiredArea); else result.append("<unset>");
		result.append(", MaxRequiredAreaAsString: ");
		if (maxRequiredAreaAsStringESet) result.append(maxRequiredAreaAsString); else result.append("<unset>");
		result.append(", MinRequiredArea: ");
		if (minRequiredAreaESet) result.append(minRequiredArea); else result.append("<unset>");
		result.append(", MinRequiredAreaAsString: ");
		if (minRequiredAreaAsStringESet) result.append(minRequiredAreaAsString); else result.append("<unset>");
		result.append(", StandardRequiredArea: ");
		result.append(standardRequiredArea);
		result.append(", StandardRequiredAreaAsString: ");
		result.append(standardRequiredAreaAsString);
		result.append(')');
		return result.toString();
	}

} //IfcSpaceProgramImpl
