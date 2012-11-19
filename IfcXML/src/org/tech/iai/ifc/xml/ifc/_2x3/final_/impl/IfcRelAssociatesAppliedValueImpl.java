/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesAppliedValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingAppliedValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Applied Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssociatesAppliedValueImpl#getRelatingAppliedValue <em>Relating Applied Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesAppliedValueImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesAppliedValue {
	/**
	 * The cached value of the '{@link #getRelatingAppliedValue() <em>Relating Applied Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingAppliedValue()
	 * @generated
	 * @ordered
	 */
	protected RelatingAppliedValueType relatingAppliedValue;

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
		return FinalPackage.eINSTANCE.getIfcRelAssociatesAppliedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingAppliedValueType getRelatingAppliedValue() {
		return relatingAppliedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingAppliedValue(RelatingAppliedValueType newRelatingAppliedValue, NotificationChain msgs) {
		RelatingAppliedValueType oldRelatingAppliedValue = relatingAppliedValue;
		relatingAppliedValue = newRelatingAppliedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE, oldRelatingAppliedValue, newRelatingAppliedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingAppliedValue(RelatingAppliedValueType newRelatingAppliedValue) {
		if (newRelatingAppliedValue != relatingAppliedValue) {
			NotificationChain msgs = null;
			if (relatingAppliedValue != null)
				msgs = ((InternalEObject)relatingAppliedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE, null, msgs);
			if (newRelatingAppliedValue != null)
				msgs = ((InternalEObject)newRelatingAppliedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE, null, msgs);
			msgs = basicSetRelatingAppliedValue(newRelatingAppliedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE, newRelatingAppliedValue, newRelatingAppliedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE:
				return basicSetRelatingAppliedValue(null, msgs);
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
			case FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE:
				return getRelatingAppliedValue();
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
			case FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE:
				setRelatingAppliedValue((RelatingAppliedValueType)newValue);
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
			case FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE:
				setRelatingAppliedValue((RelatingAppliedValueType)null);
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
			case FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE__RELATING_APPLIED_VALUE:
				return relatingAppliedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesAppliedValueImpl
