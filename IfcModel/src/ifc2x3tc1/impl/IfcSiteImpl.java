/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPostalAddress;
import ifc2x3tc1.IfcSite;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSiteImpl#getRefLatitude <em>Ref Latitude</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSiteImpl#getRefLongitude <em>Ref Longitude</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSiteImpl#getRefElevation <em>Ref Elevation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSiteImpl#getRefElevationAsString <em>Ref Elevation As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSiteImpl#getLandTitleNumber <em>Land Title Number</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSiteImpl#getSiteAddress <em>Site Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSiteImpl extends IfcSpatialStructureElementImpl implements IfcSite {
	/**
	 * The cached value of the '{@link #getRefLatitude() <em>Ref Latitude</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLatitude()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> refLatitude;

	/**
	 * The cached value of the '{@link #getRefLongitude() <em>Ref Longitude</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLongitude()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> refLongitude;

	/**
	 * The default value of the '{@link #getRefElevation() <em>Ref Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefElevation()
	 * @generated
	 * @ordered
	 */
	protected static final double REF_ELEVATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRefElevation() <em>Ref Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefElevation()
	 * @generated
	 * @ordered
	 */
	protected double refElevation = REF_ELEVATION_EDEFAULT;

	/**
	 * This is true if the Ref Elevation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refElevationESet;

	/**
	 * The default value of the '{@link #getRefElevationAsString() <em>Ref Elevation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefElevationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ELEVATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefElevationAsString() <em>Ref Elevation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefElevationAsString()
	 * @generated
	 * @ordered
	 */
	protected String refElevationAsString = REF_ELEVATION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Ref Elevation As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refElevationAsStringESet;

	/**
	 * The default value of the '{@link #getLandTitleNumber() <em>Land Title Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandTitleNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LAND_TITLE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLandTitleNumber() <em>Land Title Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandTitleNumber()
	 * @generated
	 * @ordered
	 */
	protected String landTitleNumber = LAND_TITLE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Land Title Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean landTitleNumberESet;

	/**
	 * The cached value of the '{@link #getSiteAddress() <em>Site Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAddress()
	 * @generated
	 * @ordered
	 */
	protected IfcPostalAddress siteAddress;

	/**
	 * This is true if the Site Address reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean siteAddressESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getRefLatitude() {
		if (refLatitude == null) {
			refLatitude = new EDataTypeEList.Unsettable<Integer>(Integer.class, this, Ifc2x3tc1Package.IFC_SITE__REF_LATITUDE);
		}
		return refLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefLatitude() {
		if (refLatitude != null) ((InternalEList.Unsettable<?>)refLatitude).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefLatitude() {
		return refLatitude != null && ((InternalEList.Unsettable<?>)refLatitude).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getRefLongitude() {
		if (refLongitude == null) {
			refLongitude = new EDataTypeEList.Unsettable<Integer>(Integer.class, this, Ifc2x3tc1Package.IFC_SITE__REF_LONGITUDE);
		}
		return refLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefLongitude() {
		if (refLongitude != null) ((InternalEList.Unsettable<?>)refLongitude).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefLongitude() {
		return refLongitude != null && ((InternalEList.Unsettable<?>)refLongitude).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRefElevation() {
		return refElevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefElevation(double newRefElevation) {
		double oldRefElevation = refElevation;
		refElevation = newRefElevation;
		boolean oldRefElevationESet = refElevationESet;
		refElevationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION, oldRefElevation, refElevation, !oldRefElevationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefElevation() {
		double oldRefElevation = refElevation;
		boolean oldRefElevationESet = refElevationESet;
		refElevation = REF_ELEVATION_EDEFAULT;
		refElevationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION, oldRefElevation, REF_ELEVATION_EDEFAULT, oldRefElevationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefElevation() {
		return refElevationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefElevationAsString() {
		return refElevationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefElevationAsString(String newRefElevationAsString) {
		String oldRefElevationAsString = refElevationAsString;
		refElevationAsString = newRefElevationAsString;
		boolean oldRefElevationAsStringESet = refElevationAsStringESet;
		refElevationAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION_AS_STRING, oldRefElevationAsString, refElevationAsString, !oldRefElevationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefElevationAsString() {
		String oldRefElevationAsString = refElevationAsString;
		boolean oldRefElevationAsStringESet = refElevationAsStringESet;
		refElevationAsString = REF_ELEVATION_AS_STRING_EDEFAULT;
		refElevationAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION_AS_STRING, oldRefElevationAsString, REF_ELEVATION_AS_STRING_EDEFAULT, oldRefElevationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefElevationAsString() {
		return refElevationAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLandTitleNumber() {
		return landTitleNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLandTitleNumber(String newLandTitleNumber) {
		String oldLandTitleNumber = landTitleNumber;
		landTitleNumber = newLandTitleNumber;
		boolean oldLandTitleNumberESet = landTitleNumberESet;
		landTitleNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SITE__LAND_TITLE_NUMBER, oldLandTitleNumber, landTitleNumber, !oldLandTitleNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLandTitleNumber() {
		String oldLandTitleNumber = landTitleNumber;
		boolean oldLandTitleNumberESet = landTitleNumberESet;
		landTitleNumber = LAND_TITLE_NUMBER_EDEFAULT;
		landTitleNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SITE__LAND_TITLE_NUMBER, oldLandTitleNumber, LAND_TITLE_NUMBER_EDEFAULT, oldLandTitleNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLandTitleNumber() {
		return landTitleNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPostalAddress getSiteAddress() {
		if (siteAddress != null && siteAddress.eIsProxy()) {
			InternalEObject oldSiteAddress = (InternalEObject)siteAddress;
			siteAddress = (IfcPostalAddress)eResolveProxy(oldSiteAddress);
			if (siteAddress != oldSiteAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SITE__SITE_ADDRESS, oldSiteAddress, siteAddress));
			}
		}
		return siteAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPostalAddress basicGetSiteAddress() {
		return siteAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteAddress(IfcPostalAddress newSiteAddress) {
		IfcPostalAddress oldSiteAddress = siteAddress;
		siteAddress = newSiteAddress;
		boolean oldSiteAddressESet = siteAddressESet;
		siteAddressESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SITE__SITE_ADDRESS, oldSiteAddress, siteAddress, !oldSiteAddressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSiteAddress() {
		IfcPostalAddress oldSiteAddress = siteAddress;
		boolean oldSiteAddressESet = siteAddressESet;
		siteAddress = null;
		siteAddressESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SITE__SITE_ADDRESS, oldSiteAddress, null, oldSiteAddressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSiteAddress() {
		return siteAddressESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SITE__REF_LATITUDE:
				return getRefLatitude();
			case Ifc2x3tc1Package.IFC_SITE__REF_LONGITUDE:
				return getRefLongitude();
			case Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION:
				return getRefElevation();
			case Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION_AS_STRING:
				return getRefElevationAsString();
			case Ifc2x3tc1Package.IFC_SITE__LAND_TITLE_NUMBER:
				return getLandTitleNumber();
			case Ifc2x3tc1Package.IFC_SITE__SITE_ADDRESS:
				if (resolve) return getSiteAddress();
				return basicGetSiteAddress();
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
			case Ifc2x3tc1Package.IFC_SITE__REF_LATITUDE:
				getRefLatitude().clear();
				getRefLatitude().addAll((Collection<? extends Integer>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SITE__REF_LONGITUDE:
				getRefLongitude().clear();
				getRefLongitude().addAll((Collection<? extends Integer>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION:
				setRefElevation((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION_AS_STRING:
				setRefElevationAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SITE__LAND_TITLE_NUMBER:
				setLandTitleNumber((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SITE__SITE_ADDRESS:
				setSiteAddress((IfcPostalAddress)newValue);
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
			case Ifc2x3tc1Package.IFC_SITE__REF_LATITUDE:
				unsetRefLatitude();
				return;
			case Ifc2x3tc1Package.IFC_SITE__REF_LONGITUDE:
				unsetRefLongitude();
				return;
			case Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION:
				unsetRefElevation();
				return;
			case Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION_AS_STRING:
				unsetRefElevationAsString();
				return;
			case Ifc2x3tc1Package.IFC_SITE__LAND_TITLE_NUMBER:
				unsetLandTitleNumber();
				return;
			case Ifc2x3tc1Package.IFC_SITE__SITE_ADDRESS:
				unsetSiteAddress();
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
			case Ifc2x3tc1Package.IFC_SITE__REF_LATITUDE:
				return isSetRefLatitude();
			case Ifc2x3tc1Package.IFC_SITE__REF_LONGITUDE:
				return isSetRefLongitude();
			case Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION:
				return isSetRefElevation();
			case Ifc2x3tc1Package.IFC_SITE__REF_ELEVATION_AS_STRING:
				return isSetRefElevationAsString();
			case Ifc2x3tc1Package.IFC_SITE__LAND_TITLE_NUMBER:
				return isSetLandTitleNumber();
			case Ifc2x3tc1Package.IFC_SITE__SITE_ADDRESS:
				return isSetSiteAddress();
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
		result.append(" (RefLatitude: ");
		result.append(refLatitude);
		result.append(", RefLongitude: ");
		result.append(refLongitude);
		result.append(", RefElevation: ");
		if (refElevationESet) result.append(refElevation); else result.append("<unset>");
		result.append(", RefElevationAsString: ");
		if (refElevationAsStringESet) result.append(refElevationAsString); else result.append("<unset>");
		result.append(", LandTitleNumber: ");
		if (landTitleNumberESet) result.append(landTitleNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcSiteImpl
