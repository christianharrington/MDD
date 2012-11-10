/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcClassificationItem;
import ifc2x3tc1.IfcClassificationItemRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Item Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationItemRelationshipImpl#getRelatingItem <em>Relating Item</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationItemRelationshipImpl#getRelatedItems <em>Related Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationItemRelationshipImpl extends EObjectImpl implements IfcClassificationItemRelationship {
	/**
	 * The cached value of the '{@link #getRelatingItem() <em>Relating Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingItem()
	 * @generated
	 * @ordered
	 */
	protected IfcClassificationItem relatingItem;

	/**
	 * The cached value of the '{@link #getRelatedItems() <em>Related Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcClassificationItem> relatedItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationItemRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcClassificationItemRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationItem getRelatingItem() {
		if (relatingItem != null && relatingItem.eIsProxy()) {
			InternalEObject oldRelatingItem = (InternalEObject)relatingItem;
			relatingItem = (IfcClassificationItem)eResolveProxy(oldRelatingItem);
			if (relatingItem != oldRelatingItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM, oldRelatingItem, relatingItem));
			}
		}
		return relatingItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationItem basicGetRelatingItem() {
		return relatingItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingItem(IfcClassificationItem newRelatingItem, NotificationChain msgs) {
		IfcClassificationItem oldRelatingItem = relatingItem;
		relatingItem = newRelatingItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM, oldRelatingItem, newRelatingItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingItem(IfcClassificationItem newRelatingItem) {
		if (newRelatingItem != relatingItem) {
			NotificationChain msgs = null;
			if (relatingItem != null)
				msgs = ((InternalEObject)relatingItem).eInverseRemove(this, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN, IfcClassificationItem.class, msgs);
			if (newRelatingItem != null)
				msgs = ((InternalEObject)newRelatingItem).eInverseAdd(this, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN, IfcClassificationItem.class, msgs);
			msgs = basicSetRelatingItem(newRelatingItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM, newRelatingItem, newRelatingItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClassificationItem> getRelatedItems() {
		if (relatedItems == null) {
			relatedItems = new EObjectWithInverseResolvingEList.ManyInverse<IfcClassificationItem>(IfcClassificationItem.class, this, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN);
		}
		return relatedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				if (relatingItem != null)
					msgs = ((InternalEObject)relatingItem).eInverseRemove(this, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN, IfcClassificationItem.class, msgs);
				return basicSetRelatingItem((IfcClassificationItem)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedItems()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				return basicSetRelatingItem(null, msgs);
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				return ((InternalEList<?>)getRelatedItems()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				if (resolve) return getRelatingItem();
				return basicGetRelatingItem();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				return getRelatedItems();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				setRelatingItem((IfcClassificationItem)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				getRelatedItems().clear();
				getRelatedItems().addAll((Collection<? extends IfcClassificationItem>)newValue);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				setRelatingItem((IfcClassificationItem)null);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				getRelatedItems().clear();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				return relatingItem != null;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				return relatedItems != null && !relatedItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcClassificationItemRelationshipImpl
