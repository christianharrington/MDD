/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStairFlight;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Stair Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStairFlightImpl#getNumberOfRiser <em>Number Of Riser</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStairFlightImpl#getNumberOfTreads <em>Number Of Treads</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStairFlightImpl#getRiserHeight <em>Riser Height</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStairFlightImpl#getRiserHeightAsString <em>Riser Height As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStairFlightImpl#getTreadLength <em>Tread Length</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStairFlightImpl#getTreadLengthAsString <em>Tread Length As String</em>}</li>
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
	protected static final int NUMBER_OF_RISER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRiser() <em>Number Of Riser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRiser()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRiser = NUMBER_OF_RISER_EDEFAULT;

	/**
	 * This is true if the Number Of Riser attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberOfRiserESet;

	/**
	 * The default value of the '{@link #getNumberOfTreads() <em>Number Of Treads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTreads()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_TREADS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfTreads() <em>Number Of Treads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTreads()
	 * @generated
	 * @ordered
	 */
	protected int numberOfTreads = NUMBER_OF_TREADS_EDEFAULT;

	/**
	 * This is true if the Number Of Treads attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberOfTreadsESet;

	/**
	 * The default value of the '{@link #getRiserHeight() <em>Riser Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiserHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double RISER_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRiserHeight() <em>Riser Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiserHeight()
	 * @generated
	 * @ordered
	 */
	protected double riserHeight = RISER_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Riser Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean riserHeightESet;

	/**
	 * The default value of the '{@link #getRiserHeightAsString() <em>Riser Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiserHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String RISER_HEIGHT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRiserHeightAsString() <em>Riser Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiserHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected String riserHeightAsString = RISER_HEIGHT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Riser Height As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean riserHeightAsStringESet;

	/**
	 * The default value of the '{@link #getTreadLength() <em>Tread Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreadLength()
	 * @generated
	 * @ordered
	 */
	protected static final double TREAD_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTreadLength() <em>Tread Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreadLength()
	 * @generated
	 * @ordered
	 */
	protected double treadLength = TREAD_LENGTH_EDEFAULT;

	/**
	 * This is true if the Tread Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean treadLengthESet;

	/**
	 * The default value of the '{@link #getTreadLengthAsString() <em>Tread Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreadLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TREAD_LENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreadLengthAsString() <em>Tread Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreadLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String treadLengthAsString = TREAD_LENGTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Tread Length As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean treadLengthAsStringESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcStairFlight();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRiser() {
		return numberOfRiser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRiser(int newNumberOfRiser) {
		int oldNumberOfRiser = numberOfRiser;
		numberOfRiser = newNumberOfRiser;
		boolean oldNumberOfRiserESet = numberOfRiserESet;
		numberOfRiserESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_RISER, oldNumberOfRiser, numberOfRiser, !oldNumberOfRiserESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfRiser() {
		int oldNumberOfRiser = numberOfRiser;
		boolean oldNumberOfRiserESet = numberOfRiserESet;
		numberOfRiser = NUMBER_OF_RISER_EDEFAULT;
		numberOfRiserESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_RISER, oldNumberOfRiser, NUMBER_OF_RISER_EDEFAULT, oldNumberOfRiserESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfRiser() {
		return numberOfRiserESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfTreads() {
		return numberOfTreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTreads(int newNumberOfTreads) {
		int oldNumberOfTreads = numberOfTreads;
		numberOfTreads = newNumberOfTreads;
		boolean oldNumberOfTreadsESet = numberOfTreadsESet;
		numberOfTreadsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS, oldNumberOfTreads, numberOfTreads, !oldNumberOfTreadsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfTreads() {
		int oldNumberOfTreads = numberOfTreads;
		boolean oldNumberOfTreadsESet = numberOfTreadsESet;
		numberOfTreads = NUMBER_OF_TREADS_EDEFAULT;
		numberOfTreadsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS, oldNumberOfTreads, NUMBER_OF_TREADS_EDEFAULT, oldNumberOfTreadsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfTreads() {
		return numberOfTreadsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRiserHeight() {
		return riserHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiserHeight(double newRiserHeight) {
		double oldRiserHeight = riserHeight;
		riserHeight = newRiserHeight;
		boolean oldRiserHeightESet = riserHeightESet;
		riserHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT, oldRiserHeight, riserHeight, !oldRiserHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRiserHeight() {
		double oldRiserHeight = riserHeight;
		boolean oldRiserHeightESet = riserHeightESet;
		riserHeight = RISER_HEIGHT_EDEFAULT;
		riserHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT, oldRiserHeight, RISER_HEIGHT_EDEFAULT, oldRiserHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRiserHeight() {
		return riserHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRiserHeightAsString() {
		return riserHeightAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiserHeightAsString(String newRiserHeightAsString) {
		String oldRiserHeightAsString = riserHeightAsString;
		riserHeightAsString = newRiserHeightAsString;
		boolean oldRiserHeightAsStringESet = riserHeightAsStringESet;
		riserHeightAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING, oldRiserHeightAsString, riserHeightAsString, !oldRiserHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRiserHeightAsString() {
		String oldRiserHeightAsString = riserHeightAsString;
		boolean oldRiserHeightAsStringESet = riserHeightAsStringESet;
		riserHeightAsString = RISER_HEIGHT_AS_STRING_EDEFAULT;
		riserHeightAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING, oldRiserHeightAsString, RISER_HEIGHT_AS_STRING_EDEFAULT, oldRiserHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRiserHeightAsString() {
		return riserHeightAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTreadLength() {
		return treadLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreadLength(double newTreadLength) {
		double oldTreadLength = treadLength;
		treadLength = newTreadLength;
		boolean oldTreadLengthESet = treadLengthESet;
		treadLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH, oldTreadLength, treadLength, !oldTreadLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTreadLength() {
		double oldTreadLength = treadLength;
		boolean oldTreadLengthESet = treadLengthESet;
		treadLength = TREAD_LENGTH_EDEFAULT;
		treadLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH, oldTreadLength, TREAD_LENGTH_EDEFAULT, oldTreadLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTreadLength() {
		return treadLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTreadLengthAsString() {
		return treadLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreadLengthAsString(String newTreadLengthAsString) {
		String oldTreadLengthAsString = treadLengthAsString;
		treadLengthAsString = newTreadLengthAsString;
		boolean oldTreadLengthAsStringESet = treadLengthAsStringESet;
		treadLengthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING, oldTreadLengthAsString, treadLengthAsString, !oldTreadLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTreadLengthAsString() {
		String oldTreadLengthAsString = treadLengthAsString;
		boolean oldTreadLengthAsStringESet = treadLengthAsStringESet;
		treadLengthAsString = TREAD_LENGTH_AS_STRING_EDEFAULT;
		treadLengthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING, oldTreadLengthAsString, TREAD_LENGTH_AS_STRING_EDEFAULT, oldTreadLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTreadLengthAsString() {
		return treadLengthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_RISER:
				return getNumberOfRiser();
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS:
				return getNumberOfTreads();
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT:
				return getRiserHeight();
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING:
				return getRiserHeightAsString();
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH:
				return getTreadLength();
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING:
				return getTreadLengthAsString();
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
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_RISER:
				setNumberOfRiser((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS:
				setNumberOfTreads((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT:
				setRiserHeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING:
				setRiserHeightAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH:
				setTreadLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING:
				setTreadLengthAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_RISER:
				unsetNumberOfRiser();
				return;
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS:
				unsetNumberOfTreads();
				return;
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT:
				unsetRiserHeight();
				return;
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING:
				unsetRiserHeightAsString();
				return;
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH:
				unsetTreadLength();
				return;
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING:
				unsetTreadLengthAsString();
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
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_RISER:
				return isSetNumberOfRiser();
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS:
				return isSetNumberOfTreads();
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT:
				return isSetRiserHeight();
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING:
				return isSetRiserHeightAsString();
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH:
				return isSetTreadLength();
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING:
				return isSetTreadLengthAsString();
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
		result.append(" (NumberOfRiser: ");
		if (numberOfRiserESet) result.append(numberOfRiser); else result.append("<unset>");
		result.append(", NumberOfTreads: ");
		if (numberOfTreadsESet) result.append(numberOfTreads); else result.append("<unset>");
		result.append(", RiserHeight: ");
		if (riserHeightESet) result.append(riserHeight); else result.append("<unset>");
		result.append(", RiserHeightAsString: ");
		if (riserHeightAsStringESet) result.append(riserHeightAsString); else result.append("<unset>");
		result.append(", TreadLength: ");
		if (treadLengthESet) result.append(treadLength); else result.append("<unset>");
		result.append(", TreadLengthAsString: ");
		if (treadLengthAsStringESet) result.append(treadLengthAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStairFlightImpl
