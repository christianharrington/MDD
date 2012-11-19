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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationItem;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ItemOfType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.NotationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcClassificationItemImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcClassificationItemImpl#getItemOf <em>Item Of</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcClassificationItemImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationItemImpl extends EntityImpl implements IfcClassificationItem {
	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected NotationType notation;

	/**
	 * The cached value of the '{@link #getItemOf() <em>Item Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemOf()
	 * @generated
	 * @ordered
	 */
	protected ItemOfType itemOf;

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
		return FinalPackage.eINSTANCE.getIfcClassificationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationType getNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotation(NotationType newNotation, NotificationChain msgs) {
		NotationType oldNotation = notation;
		notation = newNotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_ITEM__NOTATION, oldNotation, newNotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotation(NotationType newNotation) {
		if (newNotation != notation) {
			NotificationChain msgs = null;
			if (notation != null)
				msgs = ((InternalEObject)notation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_ITEM__NOTATION, null, msgs);
			if (newNotation != null)
				msgs = ((InternalEObject)newNotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_ITEM__NOTATION, null, msgs);
			msgs = basicSetNotation(newNotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_ITEM__NOTATION, newNotation, newNotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemOfType getItemOf() {
		return itemOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemOf(ItemOfType newItemOf, NotificationChain msgs) {
		ItemOfType oldItemOf = itemOf;
		itemOf = newItemOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_ITEM__ITEM_OF, oldItemOf, newItemOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemOf(ItemOfType newItemOf) {
		if (newItemOf != itemOf) {
			NotificationChain msgs = null;
			if (itemOf != null)
				msgs = ((InternalEObject)itemOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_ITEM__ITEM_OF, null, msgs);
			if (newItemOf != null)
				msgs = ((InternalEObject)newItemOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_ITEM__ITEM_OF, null, msgs);
			msgs = basicSetItemOf(newItemOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_ITEM__ITEM_OF, newItemOf, newItemOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_ITEM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CLASSIFICATION_ITEM__NOTATION:
				return basicSetNotation(null, msgs);
			case FinalPackage.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				return basicSetItemOf(null, msgs);
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
			case FinalPackage.IFC_CLASSIFICATION_ITEM__NOTATION:
				return getNotation();
			case FinalPackage.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				return getItemOf();
			case FinalPackage.IFC_CLASSIFICATION_ITEM__TITLE:
				return getTitle();
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
			case FinalPackage.IFC_CLASSIFICATION_ITEM__NOTATION:
				setNotation((NotationType)newValue);
				return;
			case FinalPackage.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				setItemOf((ItemOfType)newValue);
				return;
			case FinalPackage.IFC_CLASSIFICATION_ITEM__TITLE:
				setTitle((String)newValue);
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
			case FinalPackage.IFC_CLASSIFICATION_ITEM__NOTATION:
				setNotation((NotationType)null);
				return;
			case FinalPackage.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				setItemOf((ItemOfType)null);
				return;
			case FinalPackage.IFC_CLASSIFICATION_ITEM__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case FinalPackage.IFC_CLASSIFICATION_ITEM__NOTATION:
				return notation != null;
			case FinalPackage.IFC_CLASSIFICATION_ITEM__ITEM_OF:
				return itemOf != null;
			case FinalPackage.IFC_CLASSIFICATION_ITEM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //IfcClassificationItemImpl
