/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationItemRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedItemsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingItemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Item Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcClassificationItemRelationshipImpl#getRelatingItem <em>Relating Item</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcClassificationItemRelationshipImpl#getRelatedItems <em>Related Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationItemRelationshipImpl extends EntityImpl implements IfcClassificationItemRelationship {
	/**
	 * The cached value of the '{@link #getRelatingItem() <em>Relating Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingItem()
	 * @generated
	 * @ordered
	 */
	protected RelatingItemType relatingItem;

	/**
	 * The cached value of the '{@link #getRelatedItems() <em>Related Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedItems()
	 * @generated
	 * @ordered
	 */
	protected RelatedItemsType relatedItems;

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
		return FinalPackage.eINSTANCE.getIfcClassificationItemRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingItemType getRelatingItem() {
		return relatingItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingItem(RelatingItemType newRelatingItem, NotificationChain msgs) {
		RelatingItemType oldRelatingItem = relatingItem;
		relatingItem = newRelatingItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM, oldRelatingItem, newRelatingItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingItem(RelatingItemType newRelatingItem) {
		if (newRelatingItem != relatingItem) {
			NotificationChain msgs = null;
			if (relatingItem != null)
				msgs = ((InternalEObject)relatingItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM, null, msgs);
			if (newRelatingItem != null)
				msgs = ((InternalEObject)newRelatingItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM, null, msgs);
			msgs = basicSetRelatingItem(newRelatingItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM, newRelatingItem, newRelatingItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedItemsType getRelatedItems() {
		return relatedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedItems(RelatedItemsType newRelatedItems, NotificationChain msgs) {
		RelatedItemsType oldRelatedItems = relatedItems;
		relatedItems = newRelatedItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS, oldRelatedItems, newRelatedItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedItems(RelatedItemsType newRelatedItems) {
		if (newRelatedItems != relatedItems) {
			NotificationChain msgs = null;
			if (relatedItems != null)
				msgs = ((InternalEObject)relatedItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS, null, msgs);
			if (newRelatedItems != null)
				msgs = ((InternalEObject)newRelatedItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS, null, msgs);
			msgs = basicSetRelatedItems(newRelatedItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS, newRelatedItems, newRelatedItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				return basicSetRelatingItem(null, msgs);
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				return basicSetRelatedItems(null, msgs);
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
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				return getRelatingItem();
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				return getRelatedItems();
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
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				setRelatingItem((RelatingItemType)newValue);
				return;
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				setRelatedItems((RelatedItemsType)newValue);
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
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				setRelatingItem((RelatingItemType)null);
				return;
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				setRelatedItems((RelatedItemsType)null);
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
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM:
				return relatingItem != null;
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS:
				return relatedItems != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcClassificationItemRelationshipImpl
