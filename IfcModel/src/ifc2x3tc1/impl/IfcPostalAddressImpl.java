/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPostalAddress;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Postal Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPostalAddressImpl#getInternalLocation <em>Internal Location</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPostalAddressImpl#getAddressLines <em>Address Lines</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPostalAddressImpl#getPostalBox <em>Postal Box</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPostalAddressImpl#getTown <em>Town</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPostalAddressImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPostalAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPostalAddressImpl#getCountry <em>Country</em>}</li>
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
	 * This is true if the Internal Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean internalLocationESet;

	/**
	 * The cached value of the '{@link #getAddressLines() <em>Address Lines</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLines()
	 * @generated
	 * @ordered
	 */
	protected EList<String> addressLines;

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
	 * This is true if the Postal Box attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean postalBoxESet;

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
	 * This is true if the Town attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean townESet;

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
	 * This is true if the Region attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regionESet;

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
	 * This is true if the Postal Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean postalCodeESet;

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
	 * This is true if the Country attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countryESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcPostalAddress();
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
		boolean oldInternalLocationESet = internalLocationESet;
		internalLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION, oldInternalLocation, internalLocation, !oldInternalLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInternalLocation() {
		String oldInternalLocation = internalLocation;
		boolean oldInternalLocationESet = internalLocationESet;
		internalLocation = INTERNAL_LOCATION_EDEFAULT;
		internalLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION, oldInternalLocation, INTERNAL_LOCATION_EDEFAULT, oldInternalLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInternalLocation() {
		return internalLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAddressLines() {
		if (addressLines == null) {
			addressLines = new EDataTypeEList.Unsettable<String>(String.class, this, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__ADDRESS_LINES);
		}
		return addressLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddressLines() {
		if (addressLines != null) ((InternalEList.Unsettable<?>)addressLines).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddressLines() {
		return addressLines != null && ((InternalEList.Unsettable<?>)addressLines).isSet();
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
		boolean oldPostalBoxESet = postalBoxESet;
		postalBoxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_BOX, oldPostalBox, postalBox, !oldPostalBoxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPostalBox() {
		String oldPostalBox = postalBox;
		boolean oldPostalBoxESet = postalBoxESet;
		postalBox = POSTAL_BOX_EDEFAULT;
		postalBoxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_BOX, oldPostalBox, POSTAL_BOX_EDEFAULT, oldPostalBoxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPostalBox() {
		return postalBoxESet;
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
		boolean oldTownESet = townESet;
		townESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__TOWN, oldTown, town, !oldTownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTown() {
		String oldTown = town;
		boolean oldTownESet = townESet;
		town = TOWN_EDEFAULT;
		townESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__TOWN, oldTown, TOWN_EDEFAULT, oldTownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTown() {
		return townESet;
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
		boolean oldRegionESet = regionESet;
		regionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__REGION, oldRegion, region, !oldRegionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegion() {
		String oldRegion = region;
		boolean oldRegionESet = regionESet;
		region = REGION_EDEFAULT;
		regionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__REGION, oldRegion, REGION_EDEFAULT, oldRegionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegion() {
		return regionESet;
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
		boolean oldPostalCodeESet = postalCodeESet;
		postalCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_CODE, oldPostalCode, postalCode, !oldPostalCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPostalCode() {
		String oldPostalCode = postalCode;
		boolean oldPostalCodeESet = postalCodeESet;
		postalCode = POSTAL_CODE_EDEFAULT;
		postalCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_CODE, oldPostalCode, POSTAL_CODE_EDEFAULT, oldPostalCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPostalCode() {
		return postalCodeESet;
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
		boolean oldCountryESet = countryESet;
		countryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__COUNTRY, oldCountry, country, !oldCountryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCountry() {
		String oldCountry = country;
		boolean oldCountryESet = countryESet;
		country = COUNTRY_EDEFAULT;
		countryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__COUNTRY, oldCountry, COUNTRY_EDEFAULT, oldCountryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCountry() {
		return countryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION:
				return getInternalLocation();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__ADDRESS_LINES:
				return getAddressLines();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_BOX:
				return getPostalBox();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__TOWN:
				return getTown();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__REGION:
				return getRegion();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_CODE:
				return getPostalCode();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__COUNTRY:
				return getCountry();
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
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION:
				setInternalLocation((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__ADDRESS_LINES:
				getAddressLines().clear();
				getAddressLines().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_BOX:
				setPostalBox((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__TOWN:
				setTown((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__REGION:
				setRegion((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__COUNTRY:
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
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION:
				unsetInternalLocation();
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__ADDRESS_LINES:
				unsetAddressLines();
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_BOX:
				unsetPostalBox();
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__TOWN:
				unsetTown();
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__REGION:
				unsetRegion();
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_CODE:
				unsetPostalCode();
				return;
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__COUNTRY:
				unsetCountry();
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
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION:
				return isSetInternalLocation();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__ADDRESS_LINES:
				return isSetAddressLines();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_BOX:
				return isSetPostalBox();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__TOWN:
				return isSetTown();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__REGION:
				return isSetRegion();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_CODE:
				return isSetPostalCode();
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__COUNTRY:
				return isSetCountry();
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
		result.append(" (InternalLocation: ");
		if (internalLocationESet) result.append(internalLocation); else result.append("<unset>");
		result.append(", AddressLines: ");
		result.append(addressLines);
		result.append(", PostalBox: ");
		if (postalBoxESet) result.append(postalBox); else result.append("<unset>");
		result.append(", Town: ");
		if (townESet) result.append(town); else result.append("<unset>");
		result.append(", Region: ");
		if (regionESet) result.append(region); else result.append("<unset>");
		result.append(", PostalCode: ");
		if (postalCodeESet) result.append(postalCode); else result.append("<unset>");
		result.append(", Country: ");
		if (countryESet) result.append(country); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcPostalAddressImpl
