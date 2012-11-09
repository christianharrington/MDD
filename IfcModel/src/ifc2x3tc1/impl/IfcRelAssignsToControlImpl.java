/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcControl;
import ifc2x3tc1.IfcRelAssignsToControl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsToControlImpl#getRelatingControl <em>Relating Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToControlImpl extends IfcRelAssignsImpl implements IfcRelAssignsToControl {
	/**
	 * The cached value of the '{@link #getRelatingControl() <em>Relating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingControl()
	 * @generated
	 * @ordered
	 */
	protected IfcControl relatingControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsToControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssignsToControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcControl getRelatingControl() {
		if (relatingControl != null && relatingControl.eIsProxy()) {
			InternalEObject oldRelatingControl = (InternalEObject)relatingControl;
			relatingControl = (IfcControl)eResolveProxy(oldRelatingControl);
			if (relatingControl != oldRelatingControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_CONTROL__RELATING_CONTROL, oldRelatingControl, relatingControl));
			}
		}
		return relatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcControl basicGetRelatingControl() {
		return relatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingControl(IfcControl newRelatingControl, NotificationChain msgs) {
		IfcControl oldRelatingControl = relatingControl;
		relatingControl = newRelatingControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_CONTROL__RELATING_CONTROL, oldRelatingControl, newRelatingControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingControl(IfcControl newRelatingControl) {
		if (newRelatingControl != relatingControl) {
			NotificationChain msgs = null;
			if (relatingControl != null)
				msgs = ((InternalEObject)relatingControl).eInverseRemove(this, Ifc2x3tc1Package.IFC_CONTROL__CONTROLS, IfcControl.class, msgs);
			if (newRelatingControl != null)
				msgs = ((InternalEObject)newRelatingControl).eInverseAdd(this, Ifc2x3tc1Package.IFC_CONTROL__CONTROLS, IfcControl.class, msgs);
			msgs = basicSetRelatingControl(newRelatingControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_CONTROL__RELATING_CONTROL, newRelatingControl, newRelatingControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_CONTROL__RELATING_CONTROL:
				if (relatingControl != null)
					msgs = ((InternalEObject)relatingControl).eInverseRemove(this, Ifc2x3tc1Package.IFC_CONTROL__CONTROLS, IfcControl.class, msgs);
				return basicSetRelatingControl((IfcControl)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_CONTROL__RELATING_CONTROL:
				return basicSetRelatingControl(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_CONTROL__RELATING_CONTROL:
				if (resolve) return getRelatingControl();
				return basicGetRelatingControl();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_CONTROL__RELATING_CONTROL:
				setRelatingControl((IfcControl)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_CONTROL__RELATING_CONTROL:
				setRelatingControl((IfcControl)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_CONTROL__RELATING_CONTROL:
				return relatingControl != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsToControlImpl
