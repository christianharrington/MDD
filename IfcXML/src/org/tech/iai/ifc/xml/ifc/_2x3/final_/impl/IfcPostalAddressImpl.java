/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AddressLinesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPostalAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Postal Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPostalAddressImpl#getInternalLocation <em>Internal Location</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPostalAddressImpl#getAddressLines <em>Address Lines</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPostalAddressImpl#getPostalBox <em>Postal Box</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPostalAddressImpl#getTown <em>Town</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPostalAddressImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPostalAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPostalAddressImpl#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPostalAddressImpl extends IfcAddressImpl implements IfcPostalAddress {
	/**
	 * The default value of the '{@link #getInternalLocation() <em>Internal Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalLocation() <em>Internal Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalLocation()
	 * @generated
	 * @ordered
	 */
	protected String internalLocation = INTERNAL_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddressLines() <em>Address Lines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLines()
	 * @generated
	 * @ordered
	 */
	protected AddressLinesType addressLines;

	/**
	 * The default value of the '{@link #getPostalBox() <em>Postal Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalBox()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalBox() <em>Postal Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalBox()
	 * @generated
	 * @ordered
	 */
	protected String postalBox = POSTAL_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTown() <em>Town</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTown()
	 * @generated
	 * @ordered
	 */
	protected static final String TOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTown() <em>Town</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTown()
	 * @generated
	 * @ordered
	 */
	protected String town = TOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPostalAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPostalAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalLocation() {
		return internalLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalLocation(String newInternalLocation) {
		String oldInternalLocation = internalLocation;
		internalLocation = newInternalLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION, oldInternalLocation, internalLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLinesType getAddressLines() {
		return addressLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressLines(AddressLinesType newAddressLines, NotificationChain msgs) {
		AddressLinesType oldAddressLines = addressLines;
		addressLines = newAddressLines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POSTAL_ADDRESS__ADDRESS_LINES, oldAddressLines, newAddressLines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressLines(AddressLinesType newAddressLines) {
		if (newAddressLines != addressLines) {
			NotificationChain msgs = null;
			if (addressLines != null)
				msgs = ((InternalEObject)addressLines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_POSTAL_ADDRESS__ADDRESS_LINES, null, msgs);
			if (newAddressLines != null)
				msgs = ((InternalEObject)newAddressLines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_POSTAL_ADDRESS__ADDRESS_LINES, null, msgs);
			msgs = basicSetAddressLines(newAddressLines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POSTAL_ADDRESS__ADDRESS_LINES, newAddressLines, newAddressLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalBox() {
		return postalBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalBox(String newPostalBox) {
		String oldPostalBox = postalBox;
		postalBox = newPostalBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POSTAL_ADDRESS__POSTAL_BOX, oldPostalBox, postalBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTown() {
		return town;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTown(String newTown) {
		String oldTown = town;
		town = newTown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POSTAL_ADDRESS__TOWN, oldTown, town));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POSTAL_ADDRESS__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POSTAL_ADDRESS__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POSTAL_ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_POSTAL_ADDRESS__ADDRESS_LINES:
				return basicSetAddressLines(null, msgs);
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
			case FinalPackage.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION:
				return getInternalLocation();
			case FinalPackage.IFC_POSTAL_ADDRESS__ADDRESS_LINES:
				return getAddressLines();
			case FinalPackage.IFC_POSTAL_ADDRESS__POSTAL_BOX:
				return getPostalBox();
			case FinalPackage.IFC_POSTAL_ADDRESS__TOWN:
				return getTown();
			case FinalPackage.IFC_POSTAL_ADDRESS__REGION:
				return getRegion();
			case FinalPackage.IFC_POSTAL_ADDRESS__POSTAL_CODE:
				return getPostalCode();
			case FinalPackage.IFC_POSTAL_ADDRESS__COUNTRY:
				return getCountry();
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
			case FinalPackage.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION:
				setInternalLocation((String)newValue);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__ADDRESS_LINES:
				setAddressLines((AddressLinesType)newValue);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__POSTAL_BOX:
				setPostalBox((String)newValue);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__TOWN:
				setTown((String)newValue);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__REGION:
				setRegion((String)newValue);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__COUNTRY:
				setCountry((String)newValue);
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
			case FinalPackage.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION:
				setInternalLocation(INTERNAL_LOCATION_EDEFAULT);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__ADDRESS_LINES:
				setAddressLines((AddressLinesType)null);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__POSTAL_BOX:
				setPostalBox(POSTAL_BOX_EDEFAULT);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__TOWN:
				setTown(TOWN_EDEFAULT);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case FinalPackage.IFC_POSTAL_ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
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
			case FinalPackage.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION:
				return INTERNAL_LOCATION_EDEFAULT == null ? internalLocation != null : !INTERNAL_LOCATION_EDEFAULT.equals(internalLocation);
			case FinalPackage.IFC_POSTAL_ADDRESS__ADDRESS_LINES:
				return addressLines != null;
			case FinalPackage.IFC_POSTAL_ADDRESS__POSTAL_BOX:
				return POSTAL_BOX_EDEFAULT == null ? postalBox != null : !POSTAL_BOX_EDEFAULT.equals(postalBox);
			case FinalPackage.IFC_POSTAL_ADDRESS__TOWN:
				return TOWN_EDEFAULT == null ? town != null : !TOWN_EDEFAULT.equals(town);
			case FinalPackage.IFC_POSTAL_ADDRESS__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case FinalPackage.IFC_POSTAL_ADDRESS__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case FinalPackage.IFC_POSTAL_ADDRESS__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
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
		result.append(" (internalLocation: ");
		result.append(internalLocation);
		result.append(", postalBox: ");
		result.append(postalBox);
		result.append(", town: ");
		result.append(town);
		result.append(", region: ");
		result.append(region);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(", country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //IfcPostalAddressImpl
