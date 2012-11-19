/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationItem;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingItemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingItemTypeImpl#getIfcClassificationItem <em>Ifc Classification Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingItemTypeImpl extends EObjectImpl implements RelatingItemType {
	/**
	 * The cached value of the '{@link #getIfcClassificationItem() <em>Ifc Classification Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcClassificationItem()
	 * @generated
	 * @ordered
	 */
	protected IfcClassificationItem ifcClassificationItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingItemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationItem getIfcClassificationItem() {
		return ifcClassificationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcClassificationItem(IfcClassificationItem newIfcClassificationItem, NotificationChain msgs) {
		IfcClassificationItem oldIfcClassificationItem = ifcClassificationItem;
		ifcClassificationItem = newIfcClassificationItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_ITEM_TYPE__IFC_CLASSIFICATION_ITEM, oldIfcClassificationItem, newIfcClassificationItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcClassificationItem(IfcClassificationItem newIfcClassificationItem) {
		if (newIfcClassificationItem != ifcClassificationItem) {
			NotificationChain msgs = null;
			if (ifcClassificationItem != null)
				msgs = ((InternalEObject)ifcClassificationItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_ITEM_TYPE__IFC_CLASSIFICATION_ITEM, null, msgs);
			if (newIfcClassificationItem != null)
				msgs = ((InternalEObject)newIfcClassificationItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_ITEM_TYPE__IFC_CLASSIFICATION_ITEM, null, msgs);
			msgs = basicSetIfcClassificationItem(newIfcClassificationItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_ITEM_TYPE__IFC_CLASSIFICATION_ITEM, newIfcClassificationItem, newIfcClassificationItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_ITEM_TYPE__IFC_CLASSIFICATION_ITEM:
				return basicSetIfcClassificationItem(null, msgs);
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
			case FinalPackage.RELATING_ITEM_TYPE__IFC_CLASSIFICATION_ITEM:
				return getIfcClassificationItem();
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
			case FinalPackage.RELATING_ITEM_TYPE__IFC_CLASSIFICATION_ITEM:
				setIfcClassificationItem((IfcClassificationItem)newValue);
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
			case FinalPackage.RELATING_ITEM_TYPE__IFC_CLASSIFICATION_ITEM:
				setIfcClassificationItem((IfcClassificationItem)null);
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
			case FinalPackage.RELATING_ITEM_TYPE__IFC_CLASSIFICATION_ITEM:
				return ifcClassificationItem != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatingItemTypeImpl
