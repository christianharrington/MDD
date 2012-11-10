/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAppliedValue;
import ifc2x3tc1.IfcRelAssociatesAppliedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Applied Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesAppliedValueImpl#getRelatingAppliedValue <em>Relating Applied Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesAppliedValueImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesAppliedValue {
	/**
	 * The cached value of the '{@link #getRelatingAppliedValue() <em>Relating Applied Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingAppliedValue()
	 * @generated
	 * @ordered
	 */
	protected IfcAppliedValue relatingAppliedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesAppliedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssociatesAppliedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValue getRelatingAppliedValue() {
		if (relatingAppliedValue != null && relatingAppliedValue.eIsProxy()) {
			InternalEObject oldRelatingAppliedValue = (InternalEObject)relatingAppliedValue;
			relatingAppliedValue = (IfcAppliedValue)eResolveProxy(oldRelatingAppliedValue);
			if (relatingAppliedValue != oldRelatingAppliedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE, oldRelatingAppliedValue, relatingAppliedValue));
			}
		}
		return relatingAppliedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValue basicGetRelatingAppliedValue() {
		return relatingAppliedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingAppliedValue(IfcAppliedValue newRelatingAppliedValue) {
		IfcAppliedValue oldRelatingAppliedValue = relatingAppliedValue;
		relatingAppliedValue = newRelatingAppliedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE, oldRelatingAppliedValue, relatingAppliedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE:
				if (resolve) return getRelatingAppliedValue();
				return basicGetRelatingAppliedValue();
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE:
				setRelatingAppliedValue((IfcAppliedValue)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE:
				setRelatingAppliedValue((IfcAppliedValue)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE:
				return relatingAppliedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesAppliedValueImpl
