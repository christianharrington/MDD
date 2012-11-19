/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DepreciatedValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depreciated Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.DepreciatedValueTypeImpl#getIfcCostValue <em>Ifc Cost Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DepreciatedValueTypeImpl extends EObjectImpl implements DepreciatedValueType {
	/**
	 * The cached value of the '{@link #getIfcCostValue() <em>Ifc Cost Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCostValue()
	 * @generated
	 * @ordered
	 */
	protected IfcCostValue ifcCostValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepreciatedValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getDepreciatedValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getIfcCostValue() {
		return ifcCostValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCostValue(IfcCostValue newIfcCostValue, NotificationChain msgs) {
		IfcCostValue oldIfcCostValue = ifcCostValue;
		ifcCostValue = newIfcCostValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.DEPRECIATED_VALUE_TYPE__IFC_COST_VALUE, oldIfcCostValue, newIfcCostValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCostValue(IfcCostValue newIfcCostValue) {
		if (newIfcCostValue != ifcCostValue) {
			NotificationChain msgs = null;
			if (ifcCostValue != null)
				msgs = ((InternalEObject)ifcCostValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DEPRECIATED_VALUE_TYPE__IFC_COST_VALUE, null, msgs);
			if (newIfcCostValue != null)
				msgs = ((InternalEObject)newIfcCostValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DEPRECIATED_VALUE_TYPE__IFC_COST_VALUE, null, msgs);
			msgs = basicSetIfcCostValue(newIfcCostValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.DEPRECIATED_VALUE_TYPE__IFC_COST_VALUE, newIfcCostValue, newIfcCostValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.DEPRECIATED_VALUE_TYPE__IFC_COST_VALUE:
				return basicSetIfcCostValue(null, msgs);
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
			case FinalPackage.DEPRECIATED_VALUE_TYPE__IFC_COST_VALUE:
				return getIfcCostValue();
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
			case FinalPackage.DEPRECIATED_VALUE_TYPE__IFC_COST_VALUE:
				setIfcCostValue((IfcCostValue)newValue);
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
			case FinalPackage.DEPRECIATED_VALUE_TYPE__IFC_COST_VALUE:
				setIfcCostValue((IfcCostValue)null);
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
			case FinalPackage.DEPRECIATED_VALUE_TYPE__IFC_COST_VALUE:
				return ifcCostValue != null;
		}
		return super.eIsSet(featureID);
	}

} //DepreciatedValueTypeImpl
