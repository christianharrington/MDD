/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcGroup;
import ifc2x3tc1.IfcRelAssignsToGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcGroupImpl#getIsGroupedBy <em>Is Grouped By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGroupImpl extends IfcObjectImpl implements IfcGroup {
	/**
	 * The cached value of the '{@link #getIsGroupedBy() <em>Is Grouped By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGroupedBy()
	 * @generated
	 * @ordered
	 */
	protected IfcRelAssignsToGroup isGroupedBy;

	/**
	 * This is true if the Is Grouped By reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isGroupedByESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsToGroup getIsGroupedBy() {
		if (isGroupedBy != null && isGroupedBy.eIsProxy()) {
			InternalEObject oldIsGroupedBy = (InternalEObject)isGroupedBy;
			isGroupedBy = (IfcRelAssignsToGroup)eResolveProxy(oldIsGroupedBy);
			if (isGroupedBy != oldIsGroupedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY, oldIsGroupedBy, isGroupedBy));
			}
		}
		return isGroupedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsToGroup basicGetIsGroupedBy() {
		return isGroupedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsGroupedBy(IfcRelAssignsToGroup newIsGroupedBy, NotificationChain msgs) {
		IfcRelAssignsToGroup oldIsGroupedBy = isGroupedBy;
		isGroupedBy = newIsGroupedBy;
		boolean oldIsGroupedByESet = isGroupedByESet;
		isGroupedByESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY, oldIsGroupedBy, newIsGroupedBy, !oldIsGroupedByESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGroupedBy(IfcRelAssignsToGroup newIsGroupedBy) {
		if (newIsGroupedBy != isGroupedBy) {
			NotificationChain msgs = null;
			if (isGroupedBy != null)
				msgs = ((InternalEObject)isGroupedBy).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP, IfcRelAssignsToGroup.class, msgs);
			if (newIsGroupedBy != null)
				msgs = ((InternalEObject)newIsGroupedBy).eInverseAdd(this, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP, IfcRelAssignsToGroup.class, msgs);
			msgs = basicSetIsGroupedBy(newIsGroupedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldIsGroupedByESet = isGroupedByESet;
			isGroupedByESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY, newIsGroupedBy, newIsGroupedBy, !oldIsGroupedByESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetIsGroupedBy(NotificationChain msgs) {
		IfcRelAssignsToGroup oldIsGroupedBy = isGroupedBy;
		isGroupedBy = null;
		boolean oldIsGroupedByESet = isGroupedByESet;
		isGroupedByESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY, oldIsGroupedBy, null, oldIsGroupedByESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsGroupedBy() {
		if (isGroupedBy != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)isGroupedBy).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP, IfcRelAssignsToGroup.class, msgs);
			msgs = basicUnsetIsGroupedBy(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldIsGroupedByESet = isGroupedByESet;
			isGroupedByESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY, null, null, oldIsGroupedByESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsGroupedBy() {
		return isGroupedByESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY:
				if (isGroupedBy != null)
					msgs = ((InternalEObject)isGroupedBy).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP, IfcRelAssignsToGroup.class, msgs);
				return basicSetIsGroupedBy((IfcRelAssignsToGroup)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY:
				return basicUnsetIsGroupedBy(msgs);
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
			case Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY:
				if (resolve) return getIsGroupedBy();
				return basicGetIsGroupedBy();
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
			case Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY:
				setIsGroupedBy((IfcRelAssignsToGroup)newValue);
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
			case Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY:
				unsetIsGroupedBy();
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
			case Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY:
				return isSetIsGroupedBy();
		}
		return super.eIsSet(featureID);
	}

} //IfcGroupImpl
