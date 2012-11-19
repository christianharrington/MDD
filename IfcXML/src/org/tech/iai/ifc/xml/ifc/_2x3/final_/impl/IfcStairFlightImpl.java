/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStairFlight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Stair Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStairFlightImpl#getNumberOfRiser <em>Number Of Riser</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStairFlightImpl#getNumberOfTreads <em>Number Of Treads</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStairFlightImpl#getRiserHeight <em>Riser Height</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStairFlightImpl#getTreadLength <em>Tread Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStairFlightImpl extends IfcBuildingElementImpl implements IfcStairFlight {
	/**
	 * The default value of the '{@link #getNumberOfRiser() <em>Number Of Riser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRiser()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_RISER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfRiser() <em>Number Of Riser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRiser()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfRiser = NUMBER_OF_RISER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfTreads() <em>Number Of Treads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTreads()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_TREADS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfTreads() <em>Number Of Treads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTreads()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfTreads = NUMBER_OF_TREADS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiserHeight() <em>Riser Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiserHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double RISER_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRiserHeight() <em>Riser Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiserHeight()
	 * @generated
	 * @ordered
	 */
	protected Double riserHeight = RISER_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreadLength() <em>Tread Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreadLength()
	 * @generated
	 * @ordered
	 */
	protected static final Double TREAD_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreadLength() <em>Tread Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreadLength()
	 * @generated
	 * @ordered
	 */
	protected Double treadLength = TREAD_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStairFlightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStairFlight();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getNumberOfRiser() {
		return numberOfRiser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRiser(Long newNumberOfRiser) {
		Long oldNumberOfRiser = numberOfRiser;
		numberOfRiser = newNumberOfRiser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STAIR_FLIGHT__NUMBER_OF_RISER, oldNumberOfRiser, numberOfRiser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getNumberOfTreads() {
		return numberOfTreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTreads(Long newNumberOfTreads) {
		Long oldNumberOfTreads = numberOfTreads;
		numberOfTreads = newNumberOfTreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS, oldNumberOfTreads, numberOfTreads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRiserHeight() {
		return riserHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiserHeight(Double newRiserHeight) {
		Double oldRiserHeight = riserHeight;
		riserHeight = newRiserHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STAIR_FLIGHT__RISER_HEIGHT, oldRiserHeight, riserHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTreadLength() {
		return treadLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreadLength(Double newTreadLength) {
		Double oldTreadLength = treadLength;
		treadLength = newTreadLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STAIR_FLIGHT__TREAD_LENGTH, oldTreadLength, treadLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_STAIR_FLIGHT__NUMBER_OF_RISER:
				return getNumberOfRiser();
			case FinalPackage.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS:
				return getNumberOfTreads();
			case FinalPackage.IFC_STAIR_FLIGHT__RISER_HEIGHT:
				return getRiserHeight();
			case FinalPackage.IFC_STAIR_FLIGHT__TREAD_LENGTH:
				return getTreadLength();
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
			case FinalPackage.IFC_STAIR_FLIGHT__NUMBER_OF_RISER:
				setNumberOfRiser((Long)newValue);
				return;
			case FinalPackage.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS:
				setNumberOfTreads((Long)newValue);
				return;
			case FinalPackage.IFC_STAIR_FLIGHT__RISER_HEIGHT:
				setRiserHeight((Double)newValue);
				return;
			case FinalPackage.IFC_STAIR_FLIGHT__TREAD_LENGTH:
				setTreadLength((Double)newValue);
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
			case FinalPackage.IFC_STAIR_FLIGHT__NUMBER_OF_RISER:
				setNumberOfRiser(NUMBER_OF_RISER_EDEFAULT);
				return;
			case FinalPackage.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS:
				setNumberOfTreads(NUMBER_OF_TREADS_EDEFAULT);
				return;
			case FinalPackage.IFC_STAIR_FLIGHT__RISER_HEIGHT:
				setRiserHeight(RISER_HEIGHT_EDEFAULT);
				return;
			case FinalPackage.IFC_STAIR_FLIGHT__TREAD_LENGTH:
				setTreadLength(TREAD_LENGTH_EDEFAULT);
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
			case FinalPackage.IFC_STAIR_FLIGHT__NUMBER_OF_RISER:
				return NUMBER_OF_RISER_EDEFAULT == null ? numberOfRiser != null : !NUMBER_OF_RISER_EDEFAULT.equals(numberOfRiser);
			case FinalPackage.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS:
				return NUMBER_OF_TREADS_EDEFAULT == null ? numberOfTreads != null : !NUMBER_OF_TREADS_EDEFAULT.equals(numberOfTreads);
			case FinalPackage.IFC_STAIR_FLIGHT__RISER_HEIGHT:
				return RISER_HEIGHT_EDEFAULT == null ? riserHeight != null : !RISER_HEIGHT_EDEFAULT.equals(riserHeight);
			case FinalPackage.IFC_STAIR_FLIGHT__TREAD_LENGTH:
				return TREAD_LENGTH_EDEFAULT == null ? treadLength != null : !TREAD_LENGTH_EDEFAULT.equals(treadLength);
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
		result.append(" (numberOfRiser: ");
		result.append(numberOfRiser);
		result.append(", numberOfTreads: ");
		result.append(numberOfTreads);
		result.append(", riserHeight: ");
		result.append(riserHeight);
		result.append(", treadLength: ");
		result.append(treadLength);
		result.append(')');
		return result.toString();
	}

} //IfcStairFlightImpl
