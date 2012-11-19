/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCompoundPlaneAngleMeasure;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SiteAddressType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSiteImpl#getRefLatitude <em>Ref Latitude</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSiteImpl#getRefLongitude <em>Ref Longitude</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSiteImpl#getRefElevation <em>Ref Elevation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSiteImpl#getLandTitleNumber <em>Land Title Number</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSiteImpl#getSiteAddress <em>Site Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSiteImpl extends IfcSpatialStructureElementImpl implements IfcSite {
	/**
	 * The cached value of the '{@link #getRefLatitude() <em>Ref Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLatitude()
	 * @generated
	 * @ordered
	 */
	protected IfcCompoundPlaneAngleMeasure refLatitude;

	/**
	 * The cached value of the '{@link #getRefLongitude() <em>Ref Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLongitude()
	 * @generated
	 * @ordered
	 */
	protected IfcCompoundPlaneAngleMeasure refLongitude;

	/**
	 * The default value of the '{@link #getRefElevation() <em>Ref Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefElevation()
	 * @generated
	 * @ordered
	 */
	protected static final Double REF_ELEVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefElevation() <em>Ref Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefElevation()
	 * @generated
	 * @ordered
	 */
	protected Double refElevation = REF_ELEVATION_EDEFAULT;

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
	 * The cached value of the '{@link #getSiteAddress() <em>Site Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAddress()
	 * @generated
	 * @ordered
	 */
	protected SiteAddressType siteAddress;

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
		return FinalPackage.eINSTANCE.getIfcSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompoundPlaneAngleMeasure getRefLatitude() {
		return refLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefLatitude(IfcCompoundPlaneAngleMeasure newRefLatitude, NotificationChain msgs) {
		IfcCompoundPlaneAngleMeasure oldRefLatitude = refLatitude;
		refLatitude = newRefLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SITE__REF_LATITUDE, oldRefLatitude, newRefLatitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefLatitude(IfcCompoundPlaneAngleMeasure newRefLatitude) {
		if (newRefLatitude != refLatitude) {
			NotificationChain msgs = null;
			if (refLatitude != null)
				msgs = ((InternalEObject)refLatitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SITE__REF_LATITUDE, null, msgs);
			if (newRefLatitude != null)
				msgs = ((InternalEObject)newRefLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SITE__REF_LATITUDE, null, msgs);
			msgs = basicSetRefLatitude(newRefLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SITE__REF_LATITUDE, newRefLatitude, newRefLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompoundPlaneAngleMeasure getRefLongitude() {
		return refLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefLongitude(IfcCompoundPlaneAngleMeasure newRefLongitude, NotificationChain msgs) {
		IfcCompoundPlaneAngleMeasure oldRefLongitude = refLongitude;
		refLongitude = newRefLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SITE__REF_LONGITUDE, oldRefLongitude, newRefLongitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefLongitude(IfcCompoundPlaneAngleMeasure newRefLongitude) {
		if (newRefLongitude != refLongitude) {
			NotificationChain msgs = null;
			if (refLongitude != null)
				msgs = ((InternalEObject)refLongitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SITE__REF_LONGITUDE, null, msgs);
			if (newRefLongitude != null)
				msgs = ((InternalEObject)newRefLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SITE__REF_LONGITUDE, null, msgs);
			msgs = basicSetRefLongitude(newRefLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SITE__REF_LONGITUDE, newRefLongitude, newRefLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRefElevation() {
		return refElevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefElevation(Double newRefElevation) {
		Double oldRefElevation = refElevation;
		refElevation = newRefElevation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SITE__REF_ELEVATION, oldRefElevation, refElevation));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SITE__LAND_TITLE_NUMBER, oldLandTitleNumber, landTitleNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteAddressType getSiteAddress() {
		return siteAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiteAddress(SiteAddressType newSiteAddress, NotificationChain msgs) {
		SiteAddressType oldSiteAddress = siteAddress;
		siteAddress = newSiteAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SITE__SITE_ADDRESS, oldSiteAddress, newSiteAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteAddress(SiteAddressType newSiteAddress) {
		if (newSiteAddress != siteAddress) {
			NotificationChain msgs = null;
			if (siteAddress != null)
				msgs = ((InternalEObject)siteAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SITE__SITE_ADDRESS, null, msgs);
			if (newSiteAddress != null)
				msgs = ((InternalEObject)newSiteAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SITE__SITE_ADDRESS, null, msgs);
			msgs = basicSetSiteAddress(newSiteAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SITE__SITE_ADDRESS, newSiteAddress, newSiteAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SITE__REF_LATITUDE:
				return basicSetRefLatitude(null, msgs);
			case FinalPackage.IFC_SITE__REF_LONGITUDE:
				return basicSetRefLongitude(null, msgs);
			case FinalPackage.IFC_SITE__SITE_ADDRESS:
				return basicSetSiteAddress(null, msgs);
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
			case FinalPackage.IFC_SITE__REF_LATITUDE:
				return getRefLatitude();
			case FinalPackage.IFC_SITE__REF_LONGITUDE:
				return getRefLongitude();
			case FinalPackage.IFC_SITE__REF_ELEVATION:
				return getRefElevation();
			case FinalPackage.IFC_SITE__LAND_TITLE_NUMBER:
				return getLandTitleNumber();
			case FinalPackage.IFC_SITE__SITE_ADDRESS:
				return getSiteAddress();
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
			case FinalPackage.IFC_SITE__REF_LATITUDE:
				setRefLatitude((IfcCompoundPlaneAngleMeasure)newValue);
				return;
			case FinalPackage.IFC_SITE__REF_LONGITUDE:
				setRefLongitude((IfcCompoundPlaneAngleMeasure)newValue);
				return;
			case FinalPackage.IFC_SITE__REF_ELEVATION:
				setRefElevation((Double)newValue);
				return;
			case FinalPackage.IFC_SITE__LAND_TITLE_NUMBER:
				setLandTitleNumber((String)newValue);
				return;
			case FinalPackage.IFC_SITE__SITE_ADDRESS:
				setSiteAddress((SiteAddressType)newValue);
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
			case FinalPackage.IFC_SITE__REF_LATITUDE:
				setRefLatitude((IfcCompoundPlaneAngleMeasure)null);
				return;
			case FinalPackage.IFC_SITE__REF_LONGITUDE:
				setRefLongitude((IfcCompoundPlaneAngleMeasure)null);
				return;
			case FinalPackage.IFC_SITE__REF_ELEVATION:
				setRefElevation(REF_ELEVATION_EDEFAULT);
				return;
			case FinalPackage.IFC_SITE__LAND_TITLE_NUMBER:
				setLandTitleNumber(LAND_TITLE_NUMBER_EDEFAULT);
				return;
			case FinalPackage.IFC_SITE__SITE_ADDRESS:
				setSiteAddress((SiteAddressType)null);
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
			case FinalPackage.IFC_SITE__REF_LATITUDE:
				return refLatitude != null;
			case FinalPackage.IFC_SITE__REF_LONGITUDE:
				return refLongitude != null;
			case FinalPackage.IFC_SITE__REF_ELEVATION:
				return REF_ELEVATION_EDEFAULT == null ? refElevation != null : !REF_ELEVATION_EDEFAULT.equals(refElevation);
			case FinalPackage.IFC_SITE__LAND_TITLE_NUMBER:
				return LAND_TITLE_NUMBER_EDEFAULT == null ? landTitleNumber != null : !LAND_TITLE_NUMBER_EDEFAULT.equals(landTitleNumber);
			case FinalPackage.IFC_SITE__SITE_ADDRESS:
				return siteAddress != null;
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
		result.append(" (refElevation: ");
		result.append(refElevation);
		result.append(", landTitleNumber: ");
		result.append(landTitleNumber);
		result.append(')');
		return result.toString();
	}

} //IfcSiteImpl
