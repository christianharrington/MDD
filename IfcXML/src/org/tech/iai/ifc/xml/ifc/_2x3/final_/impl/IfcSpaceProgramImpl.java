/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RequestedLocationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceProgramImpl#getSpaceProgramIdentifier <em>Space Program Identifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceProgramImpl#getMaxRequiredArea <em>Max Required Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceProgramImpl#getMinRequiredArea <em>Min Required Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceProgramImpl#getRequestedLocation <em>Requested Location</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceProgramImpl#getStandardRequiredArea <em>Standard Required Area</em>}</li>
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
	protected static final Double MAX_REQUIRED_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRequiredArea() <em>Max Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequiredArea()
	 * @generated
	 * @ordered
	 */
	protected Double maxRequiredArea = MAX_REQUIRED_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRequiredArea() <em>Min Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequiredArea()
	 * @generated
	 * @ordered
	 */
	protected static final Double MIN_REQUIRED_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinRequiredArea() <em>Min Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequiredArea()
	 * @generated
	 * @ordered
	 */
	protected Double minRequiredArea = MIN_REQUIRED_AREA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestedLocation() <em>Requested Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedLocation()
	 * @generated
	 * @ordered
	 */
	protected RequestedLocationType requestedLocation;

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
		return FinalPackage.eINSTANCE.getIfcSpaceProgram();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER, oldSpaceProgramIdentifier, spaceProgramIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaxRequiredArea() {
		return maxRequiredArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRequiredArea(Double newMaxRequiredArea) {
		Double oldMaxRequiredArea = maxRequiredArea;
		maxRequiredArea = newMaxRequiredArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA, oldMaxRequiredArea, maxRequiredArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinRequiredArea() {
		return minRequiredArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequiredArea(Double newMinRequiredArea) {
		Double oldMinRequiredArea = minRequiredArea;
		minRequiredArea = newMinRequiredArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA, oldMinRequiredArea, minRequiredArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedLocationType getRequestedLocation() {
		return requestedLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedLocation(RequestedLocationType newRequestedLocation, NotificationChain msgs) {
		RequestedLocationType oldRequestedLocation = requestedLocation;
		requestedLocation = newRequestedLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_PROGRAM__REQUESTED_LOCATION, oldRequestedLocation, newRequestedLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedLocation(RequestedLocationType newRequestedLocation) {
		if (newRequestedLocation != requestedLocation) {
			NotificationChain msgs = null;
			if (requestedLocation != null)
				msgs = ((InternalEObject)requestedLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SPACE_PROGRAM__REQUESTED_LOCATION, null, msgs);
			if (newRequestedLocation != null)
				msgs = ((InternalEObject)newRequestedLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SPACE_PROGRAM__REQUESTED_LOCATION, null, msgs);
			msgs = basicSetRequestedLocation(newRequestedLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_PROGRAM__REQUESTED_LOCATION, newRequestedLocation, newRequestedLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA, oldStandardRequiredArea, standardRequiredArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SPACE_PROGRAM__REQUESTED_LOCATION:
				return basicSetRequestedLocation(null, msgs);
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
			case FinalPackage.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER:
				return getSpaceProgramIdentifier();
			case FinalPackage.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA:
				return getMaxRequiredArea();
			case FinalPackage.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA:
				return getMinRequiredArea();
			case FinalPackage.IFC_SPACE_PROGRAM__REQUESTED_LOCATION:
				return getRequestedLocation();
			case FinalPackage.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA:
				return getStandardRequiredArea();
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
			case FinalPackage.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER:
				setSpaceProgramIdentifier((String)newValue);
				return;
			case FinalPackage.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA:
				setMaxRequiredArea((Double)newValue);
				return;
			case FinalPackage.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA:
				setMinRequiredArea((Double)newValue);
				return;
			case FinalPackage.IFC_SPACE_PROGRAM__REQUESTED_LOCATION:
				setRequestedLocation((RequestedLocationType)newValue);
				return;
			case FinalPackage.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA:
				setStandardRequiredArea((Double)newValue);
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
			case FinalPackage.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER:
				setSpaceProgramIdentifier(SPACE_PROGRAM_IDENTIFIER_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA:
				setMaxRequiredArea(MAX_REQUIRED_AREA_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA:
				setMinRequiredArea(MIN_REQUIRED_AREA_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_PROGRAM__REQUESTED_LOCATION:
				setRequestedLocation((RequestedLocationType)null);
				return;
			case FinalPackage.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA:
				setStandardRequiredArea(STANDARD_REQUIRED_AREA_EDEFAULT);
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
			case FinalPackage.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER:
				return SPACE_PROGRAM_IDENTIFIER_EDEFAULT == null ? spaceProgramIdentifier != null : !SPACE_PROGRAM_IDENTIFIER_EDEFAULT.equals(spaceProgramIdentifier);
			case FinalPackage.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA:
				return MAX_REQUIRED_AREA_EDEFAULT == null ? maxRequiredArea != null : !MAX_REQUIRED_AREA_EDEFAULT.equals(maxRequiredArea);
			case FinalPackage.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA:
				return MIN_REQUIRED_AREA_EDEFAULT == null ? minRequiredArea != null : !MIN_REQUIRED_AREA_EDEFAULT.equals(minRequiredArea);
			case FinalPackage.IFC_SPACE_PROGRAM__REQUESTED_LOCATION:
				return requestedLocation != null;
			case FinalPackage.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA:
				return standardRequiredArea != STANDARD_REQUIRED_AREA_EDEFAULT;
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
		result.append(" (spaceProgramIdentifier: ");
		result.append(spaceProgramIdentifier);
		result.append(", maxRequiredArea: ");
		result.append(maxRequiredArea);
		result.append(", minRequiredArea: ");
		result.append(minRequiredArea);
		result.append(", standardRequiredArea: ");
		result.append(standardRequiredArea);
		result.append(')');
		return result.toString();
	}

} //IfcSpaceProgramImpl
