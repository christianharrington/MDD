/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMonetaryUnit;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingMonetaryUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Monetary Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingMonetaryUnitTypeImpl#getIfcMonetaryUnit <em>Ifc Monetary Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingMonetaryUnitTypeImpl extends EObjectImpl implements RelatingMonetaryUnitType {
	/**
	 * The cached value of the '{@link #getIfcMonetaryUnit() <em>Ifc Monetary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMonetaryUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcMonetaryUnit ifcMonetaryUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingMonetaryUnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingMonetaryUnitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryUnit getIfcMonetaryUnit() {
		return ifcMonetaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMonetaryUnit(IfcMonetaryUnit newIfcMonetaryUnit, NotificationChain msgs) {
		IfcMonetaryUnit oldIfcMonetaryUnit = ifcMonetaryUnit;
		ifcMonetaryUnit = newIfcMonetaryUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MONETARY_UNIT_TYPE__IFC_MONETARY_UNIT, oldIfcMonetaryUnit, newIfcMonetaryUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMonetaryUnit(IfcMonetaryUnit newIfcMonetaryUnit) {
		if (newIfcMonetaryUnit != ifcMonetaryUnit) {
			NotificationChain msgs = null;
			if (ifcMonetaryUnit != null)
				msgs = ((InternalEObject)ifcMonetaryUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MONETARY_UNIT_TYPE__IFC_MONETARY_UNIT, null, msgs);
			if (newIfcMonetaryUnit != null)
				msgs = ((InternalEObject)newIfcMonetaryUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MONETARY_UNIT_TYPE__IFC_MONETARY_UNIT, null, msgs);
			msgs = basicSetIfcMonetaryUnit(newIfcMonetaryUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MONETARY_UNIT_TYPE__IFC_MONETARY_UNIT, newIfcMonetaryUnit, newIfcMonetaryUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_MONETARY_UNIT_TYPE__IFC_MONETARY_UNIT:
				return basicSetIfcMonetaryUnit(null, msgs);
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
			case FinalPackage.RELATING_MONETARY_UNIT_TYPE__IFC_MONETARY_UNIT:
				return getIfcMonetaryUnit();
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
			case FinalPackage.RELATING_MONETARY_UNIT_TYPE__IFC_MONETARY_UNIT:
				setIfcMonetaryUnit((IfcMonetaryUnit)newValue);
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
			case FinalPackage.RELATING_MONETARY_UNIT_TYPE__IFC_MONETARY_UNIT:
				setIfcMonetaryUnit((IfcMonetaryUnit)null);
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
			case FinalPackage.RELATING_MONETARY_UNIT_TYPE__IFC_MONETARY_UNIT:
				return ifcMonetaryUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatingMonetaryUnitTypeImpl
