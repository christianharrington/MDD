/**
 */
package log.impl;

import log.ExtendedDataAddedToRevision;
import log.LogPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.ExtendedData;
import store.Revision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Data Added To Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link log.impl.ExtendedDataAddedToRevisionImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link log.impl.ExtendedDataAddedToRevisionImpl#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedDataAddedToRevisionImpl extends LogActionImpl implements ExtendedDataAddedToRevision {
	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected Revision revision;

	/**
	 * The cached value of the '{@link #getExtendedData() <em>Extended Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedData()
	 * @generated
	 * @ordered
	 */
	protected ExtendedData extendedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedDataAddedToRevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.EXTENDED_DATA_ADDED_TO_REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getRevision() {
		if (revision != null && revision.eIsProxy()) {
			InternalEObject oldRevision = (InternalEObject)revision;
			revision = (Revision)eResolveProxy(oldRevision);
			if (revision != oldRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__REVISION, oldRevision, revision));
			}
		}
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision basicGetRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(Revision newRevision) {
		Revision oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedData getExtendedData() {
		if (extendedData != null && extendedData.eIsProxy()) {
			InternalEObject oldExtendedData = (InternalEObject)extendedData;
			extendedData = (ExtendedData)eResolveProxy(oldExtendedData);
			if (extendedData != oldExtendedData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__EXTENDED_DATA, oldExtendedData, extendedData));
			}
		}
		return extendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedData basicGetExtendedData() {
		return extendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedData(ExtendedData newExtendedData) {
		ExtendedData oldExtendedData = extendedData;
		extendedData = newExtendedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__EXTENDED_DATA, oldExtendedData, extendedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__REVISION:
				if (resolve) return getRevision();
				return basicGetRevision();
			case LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__EXTENDED_DATA:
				if (resolve) return getExtendedData();
				return basicGetExtendedData();
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
			case LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__REVISION:
				setRevision((Revision)newValue);
				return;
			case LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__EXTENDED_DATA:
				setExtendedData((ExtendedData)newValue);
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
			case LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__REVISION:
				setRevision((Revision)null);
				return;
			case LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__EXTENDED_DATA:
				setExtendedData((ExtendedData)null);
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
			case LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__REVISION:
				return revision != null;
			case LogPackage.EXTENDED_DATA_ADDED_TO_REVISION__EXTENDED_DATA:
				return extendedData != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtendedDataAddedToRevisionImpl
