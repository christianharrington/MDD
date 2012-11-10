/**
 */
package log.impl;

import log.GeoTagUpdated;
import log.LogPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.GeoTag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Tag Updated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link log.impl.GeoTagUpdatedImpl#getGeoTag <em>Geo Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeoTagUpdatedImpl extends LogActionImpl implements GeoTagUpdated {
	/**
	 * The cached value of the '{@link #getGeoTag() <em>Geo Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoTag()
	 * @generated
	 * @ordered
	 */
	protected GeoTag geoTag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoTagUpdatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.GEO_TAG_UPDATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoTag getGeoTag() {
		if (geoTag != null && geoTag.eIsProxy()) {
			InternalEObject oldGeoTag = (InternalEObject)geoTag;
			geoTag = (GeoTag)eResolveProxy(oldGeoTag);
			if (geoTag != oldGeoTag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.GEO_TAG_UPDATED__GEO_TAG, oldGeoTag, geoTag));
			}
		}
		return geoTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoTag basicGetGeoTag() {
		return geoTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeoTag(GeoTag newGeoTag) {
		GeoTag oldGeoTag = geoTag;
		geoTag = newGeoTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.GEO_TAG_UPDATED__GEO_TAG, oldGeoTag, geoTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogPackage.GEO_TAG_UPDATED__GEO_TAG:
				if (resolve) return getGeoTag();
				return basicGetGeoTag();
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
			case LogPackage.GEO_TAG_UPDATED__GEO_TAG:
				setGeoTag((GeoTag)newValue);
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
			case LogPackage.GEO_TAG_UPDATED__GEO_TAG:
				setGeoTag((GeoTag)null);
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
			case LogPackage.GEO_TAG_UPDATED__GEO_TAG:
				return geoTag != null;
		}
		return super.eIsSet(featureID);
	}

} //GeoTagUpdatedImpl
