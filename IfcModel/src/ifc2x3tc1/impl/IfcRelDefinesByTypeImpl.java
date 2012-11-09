/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRelDefinesByType;
import ifc2x3tc1.IfcTypeObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Defines By Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelDefinesByTypeImpl#getRelatingType <em>Relating Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelDefinesByTypeImpl extends IfcRelDefinesImpl implements IfcRelDefinesByType {
	/**
	 * The cached value of the '{@link #getRelatingType() <em>Relating Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingType()
	 * @generated
	 * @ordered
	 */
	protected IfcTypeObject relatingType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelDefinesByTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelDefinesByType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTypeObject getRelatingType() {
		if (relatingType != null && relatingType.eIsProxy()) {
			InternalEObject oldRelatingType = (InternalEObject)relatingType;
			relatingType = (IfcTypeObject)eResolveProxy(oldRelatingType);
			if (relatingType != oldRelatingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE, oldRelatingType, relatingType));
			}
		}
		return relatingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTypeObject basicGetRelatingType() {
		return relatingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingType(IfcTypeObject newRelatingType, NotificationChain msgs) {
		IfcTypeObject oldRelatingType = relatingType;
		relatingType = newRelatingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE, oldRelatingType, newRelatingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingType(IfcTypeObject newRelatingType) {
		if (newRelatingType != relatingType) {
			NotificationChain msgs = null;
			if (relatingType != null)
				msgs = ((InternalEObject)relatingType).eInverseRemove(this, Ifc2x3tc1Package.IFC_TYPE_OBJECT__OBJECT_TYPE_OF, IfcTypeObject.class, msgs);
			if (newRelatingType != null)
				msgs = ((InternalEObject)newRelatingType).eInverseAdd(this, Ifc2x3tc1Package.IFC_TYPE_OBJECT__OBJECT_TYPE_OF, IfcTypeObject.class, msgs);
			msgs = basicSetRelatingType(newRelatingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE, newRelatingType, newRelatingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				if (relatingType != null)
					msgs = ((InternalEObject)relatingType).eInverseRemove(this, Ifc2x3tc1Package.IFC_TYPE_OBJECT__OBJECT_TYPE_OF, IfcTypeObject.class, msgs);
				return basicSetRelatingType((IfcTypeObject)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				return basicSetRelatingType(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				if (resolve) return getRelatingType();
				return basicGetRelatingType();
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
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				setRelatingType((IfcTypeObject)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				setRelatingType((IfcTypeObject)null);
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
			case Ifc2x3tc1Package.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				return relatingType != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelDefinesByTypeImpl
