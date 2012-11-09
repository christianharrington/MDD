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
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsToGroupImpl#getRelatingGroup <em>Relating Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToGroupImpl extends IfcRelAssignsImpl implements IfcRelAssignsToGroup {
	/**
	 * The cached value of the '{@link #getRelatingGroup() <em>Relating Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingGroup()
	 * @generated
	 * @ordered
	 */
	protected IfcGroup relatingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsToGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssignsToGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGroup getRelatingGroup() {
		if (relatingGroup != null && relatingGroup.eIsProxy()) {
			InternalEObject oldRelatingGroup = (InternalEObject)relatingGroup;
			relatingGroup = (IfcGroup)eResolveProxy(oldRelatingGroup);
			if (relatingGroup != oldRelatingGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP, oldRelatingGroup, relatingGroup));
			}
		}
		return relatingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGroup basicGetRelatingGroup() {
		return relatingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingGroup(IfcGroup newRelatingGroup, NotificationChain msgs) {
		IfcGroup oldRelatingGroup = relatingGroup;
		relatingGroup = newRelatingGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP, oldRelatingGroup, newRelatingGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingGroup(IfcGroup newRelatingGroup) {
		if (newRelatingGroup != relatingGroup) {
			NotificationChain msgs = null;
			if (relatingGroup != null)
				msgs = ((InternalEObject)relatingGroup).eInverseRemove(this, Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY, IfcGroup.class, msgs);
			if (newRelatingGroup != null)
				msgs = ((InternalEObject)newRelatingGroup).eInverseAdd(this, Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY, IfcGroup.class, msgs);
			msgs = basicSetRelatingGroup(newRelatingGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP, newRelatingGroup, newRelatingGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP:
				if (relatingGroup != null)
					msgs = ((InternalEObject)relatingGroup).eInverseRemove(this, Ifc2x3tc1Package.IFC_GROUP__IS_GROUPED_BY, IfcGroup.class, msgs);
				return basicSetRelatingGroup((IfcGroup)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP:
				return basicSetRelatingGroup(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP:
				if (resolve) return getRelatingGroup();
				return basicGetRelatingGroup();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP:
				setRelatingGroup((IfcGroup)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP:
				setRelatingGroup((IfcGroup)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_GROUP__RELATING_GROUP:
				return relatingGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsToGroupImpl
