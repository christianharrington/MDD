/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcClassification;
import ifc2x3tc1.IfcClassificationItem;
import ifc2x3tc1.IfcClassificationItemRelationship;
import ifc2x3tc1.IfcClassificationNotationFacet;

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
 * An implementation of the model object '<em><b>Ifc Classification Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationItemImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationItemImpl#getItemOf <em>Item Of</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationItemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationItemImpl#getIsClassifiedItemIn <em>Is Classified Item In</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationItemImpl#getIsClassifyingItemIn <em>Is Classifying Item In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationItemImpl extends EObjectImpl implements IfcClassificationItem {
	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected IfcClassificationNotationFacet notation;

	/**
	 * The cached value of the '{@link #getItemOf() <em>Item Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemOf()
	 * @generated
	 * @ordered
	 */
	protected IfcClassification itemOf;

	/**
	 * This is true if the Item Of reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itemOfESet;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsClassifiedItemIn() <em>Is Classified Item In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsClassifiedItemIn()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcClassificationItemRelationship> isClassifiedItemIn;

	/**
	 * The cached value of the '{@link #getIsClassifyingItemIn() <em>Is Classifying Item In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsClassifyingItemIn()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcClassificationItemRelationship> isClassifyingItemIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcClassificationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotationFacet getNotation() {
		if (notation != null && notation.eIsProxy()) {
			InternalEObject oldNotation = (InternalEObject)notation;
			notation = (IfcClassificationNotationFacet)eResolveProxy(oldNotation);
			if (notation != oldNotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__NOTATION, oldNotation, notation));
			}
		}
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotationFacet basicGetNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotation(IfcClassificationNotationFacet newNotation) {
		IfcClassificationNotationFacet oldNotation = notation;
		notation = newNotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__NOTATION, oldNotation, notation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassification getItemOf() {
		if (itemOf != null && itemOf.eIsProxy()) {
			InternalEObject oldItemOf = (InternalEObject)itemOf;
			itemOf = (IfcClassification)eResolveProxy(oldItemOf);
			if (itemOf != oldItemOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF, oldItemOf, itemOf));
			}
		}
		return itemOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassification basicGetItemOf() {
		return itemOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemOf(IfcClassification newItemOf, NotificationChain msgs) {
		IfcClassification oldItemOf = itemOf;
		itemOf = newItemOf;
		boolean oldItemOfESet = itemOfESet;
		itemOfESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF, oldItemOf, newItemOf, !oldItemOfESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemOf(IfcClassification newItemOf) {
		if (newItemOf != itemOf) {
			NotificationChain msgs = null;
			if (itemOf != null)
				msgs = ((InternalEObject)itemOf).eInverseRemove(this, Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS, IfcClassification.class, msgs);
			if (newItemOf != null)
				msgs = ((InternalEObject)newItemOf).eInverseAdd(this, Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS, IfcClassification.class, msgs);
			msgs = basicSetItemOf(newItemOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldItemOfESet = itemOfESet;
			itemOfESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF, newItemOf, newItemOf, !oldItemOfESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetItemOf(NotificationChain msgs) {
		IfcClassification oldItemOf = itemOf;
		itemOf = null;
		boolean oldItemOfESet = itemOfESet;
		itemOfESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF, oldItemOf, null, oldItemOfESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemOf() {
		if (itemOf != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)itemOf).eInverseRemove(this, Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS, IfcClassification.class, msgs);
			msgs = basicUnsetItemOf(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldItemOfESet = itemOfESet;
			itemOfESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF, null, null, oldItemOfESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemOf() {
		return itemOfESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClassificationItemRelationship> getIsClassifiedItemIn() {
		if (isClassifiedItemIn == null) {
			isClassifiedItemIn = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcClassificationItemRelationship>(IfcClassificationItemRelationship.class, this, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATED_ITEMS);
		}
		return isClassifiedItemIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsClassifiedItemIn() {
		if (isClassifiedItemIn != null) ((InternalEList.Unsettable<?>)isClassifiedItemIn).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsClassifiedItemIn() {
		return isClassifiedItemIn != null && ((InternalEList.Unsettable<?>)isClassifiedItemIn).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClassificationItemRelationship> getIsClassifyingItemIn() {
		if (isClassifyingItemIn == null) {
			isClassifyingItemIn = new EObjectWithInverseResolvingEList.Unsettable<IfcClassificationItemRelationship>(IfcClassificationItemRelationship.class, this, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM_RELATIONSHIP__RELATING_ITEM);
		}
		return isClassifyingItemIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsClassifyingItemIn() {
		if (isClassifyingItemIn != null) ((InternalEList.Unsettable<?>)isClassifyingItemIn).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsClassifyingItemIn() {
		return isClassifyingItemIn != null && ((InternalEList.Unsettable<?>)isClassifyingItemIn).isSet();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				if (itemOf != null)
					msgs = ((InternalEObject)itemOf).eInverseRemove(this, Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS, IfcClassification.class, msgs);
				return basicSetItemOf((IfcClassification)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsClassifiedItemIn()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsClassifyingItemIn()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				return basicUnsetItemOf(msgs);
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN:
				return ((InternalEList<?>)getIsClassifiedItemIn()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN:
				return ((InternalEList<?>)getIsClassifyingItemIn()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__NOTATION:
				if (resolve) return getNotation();
				return basicGetNotation();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				if (resolve) return getItemOf();
				return basicGetItemOf();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__TITLE:
				return getTitle();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN:
				return getIsClassifiedItemIn();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN:
				return getIsClassifyingItemIn();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__NOTATION:
				setNotation((IfcClassificationNotationFacet)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				setItemOf((IfcClassification)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__TITLE:
				setTitle((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN:
				getIsClassifiedItemIn().clear();
				getIsClassifiedItemIn().addAll((Collection<? extends IfcClassificationItemRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN:
				getIsClassifyingItemIn().clear();
				getIsClassifyingItemIn().addAll((Collection<? extends IfcClassificationItemRelationship>)newValue);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__NOTATION:
				setNotation((IfcClassificationNotationFacet)null);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				unsetItemOf();
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN:
				unsetIsClassifiedItemIn();
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN:
				unsetIsClassifyingItemIn();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__NOTATION:
				return notation != null;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				return isSetItemOf();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFIED_ITEM_IN:
				return isSetIsClassifiedItemIn();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__IS_CLASSIFYING_ITEM_IN:
				return isSetIsClassifyingItemIn();
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
		result.append(" (Title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //IfcClassificationItemImpl
