/**
 */
package store.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import store.CompareItem;
import store.DataObject;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.CompareItemImpl#getDataObject <em>Data Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareItemImpl extends EObjectImpl implements CompareItem {
	/**
	 * The cached value of the '{@link #getDataObject() <em>Data Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObject()
	 * @generated
	 * @ordered
	 */
	protected DataObject dataObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.COMPARE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject getDataObject() {
		if (dataObject != null && dataObject.eIsProxy()) {
			InternalEObject oldDataObject = (InternalEObject)dataObject;
			dataObject = (DataObject)eResolveProxy(oldDataObject);
			if (dataObject != oldDataObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.COMPARE_ITEM__DATA_OBJECT, oldDataObject, dataObject));
			}
		}
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject basicGetDataObject() {
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataObject(DataObject newDataObject) {
		DataObject oldDataObject = dataObject;
		dataObject = newDataObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.COMPARE_ITEM__DATA_OBJECT, oldDataObject, dataObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.COMPARE_ITEM__DATA_OBJECT:
				if (resolve) return getDataObject();
				return basicGetDataObject();
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
			case StorePackage.COMPARE_ITEM__DATA_OBJECT:
				setDataObject((DataObject)newValue);
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
			case StorePackage.COMPARE_ITEM__DATA_OBJECT:
				setDataObject((DataObject)null);
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
			case StorePackage.COMPARE_ITEM__DATA_OBJECT:
				return dataObject != null;
		}
		return super.eIsSet(featureID);
	}

} //CompareItemImpl
