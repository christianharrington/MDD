/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDerivedUnit;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMonetaryUnit;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNamedUnit;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUnitImpl#getIfcDerivedUnit <em>Ifc Derived Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUnitImpl#getIfcNamedUnitGroup <em>Ifc Named Unit Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUnitImpl#getIfcNamedUnit <em>Ifc Named Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUnitImpl#getIfcMonetaryUnit <em>Ifc Monetary Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcUnitImpl extends EObjectImpl implements IfcUnit {
	/**
	 * The cached value of the '{@link #getIfcDerivedUnit() <em>Ifc Derived Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDerivedUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcDerivedUnit ifcDerivedUnit;

	/**
	 * The cached value of the '{@link #getIfcNamedUnitGroup() <em>Ifc Named Unit Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcNamedUnitGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcNamedUnitGroup;

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
	protected IfcUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedUnit getIfcDerivedUnit() {
		return ifcDerivedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDerivedUnit(IfcDerivedUnit newIfcDerivedUnit, NotificationChain msgs) {
		IfcDerivedUnit oldIfcDerivedUnit = ifcDerivedUnit;
		ifcDerivedUnit = newIfcDerivedUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_UNIT__IFC_DERIVED_UNIT, oldIfcDerivedUnit, newIfcDerivedUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDerivedUnit(IfcDerivedUnit newIfcDerivedUnit) {
		if (newIfcDerivedUnit != ifcDerivedUnit) {
			NotificationChain msgs = null;
			if (ifcDerivedUnit != null)
				msgs = ((InternalEObject)ifcDerivedUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_UNIT__IFC_DERIVED_UNIT, null, msgs);
			if (newIfcDerivedUnit != null)
				msgs = ((InternalEObject)newIfcDerivedUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_UNIT__IFC_DERIVED_UNIT, null, msgs);
			msgs = basicSetIfcDerivedUnit(newIfcDerivedUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_UNIT__IFC_DERIVED_UNIT, newIfcDerivedUnit, newIfcDerivedUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcNamedUnitGroup() {
		if (ifcNamedUnitGroup == null) {
			ifcNamedUnitGroup = new BasicFeatureMap(this, FinalPackage.IFC_UNIT__IFC_NAMED_UNIT_GROUP);
		}
		return ifcNamedUnitGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNamedUnit getIfcNamedUnit() {
		return (IfcNamedUnit)getIfcNamedUnitGroup().get(FinalPackage.eINSTANCE.getIfcUnit_IfcNamedUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcNamedUnit(IfcNamedUnit newIfcNamedUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcNamedUnitGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcUnit_IfcNamedUnit(), newIfcNamedUnit, msgs);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_UNIT__IFC_MONETARY_UNIT, oldIfcMonetaryUnit, newIfcMonetaryUnit);
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
				msgs = ((InternalEObject)ifcMonetaryUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_UNIT__IFC_MONETARY_UNIT, null, msgs);
			if (newIfcMonetaryUnit != null)
				msgs = ((InternalEObject)newIfcMonetaryUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_UNIT__IFC_MONETARY_UNIT, null, msgs);
			msgs = basicSetIfcMonetaryUnit(newIfcMonetaryUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_UNIT__IFC_MONETARY_UNIT, newIfcMonetaryUnit, newIfcMonetaryUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_UNIT__IFC_DERIVED_UNIT:
				return basicSetIfcDerivedUnit(null, msgs);
			case FinalPackage.IFC_UNIT__IFC_NAMED_UNIT_GROUP:
				return ((InternalEList<?>)getIfcNamedUnitGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_UNIT__IFC_NAMED_UNIT:
				return basicSetIfcNamedUnit(null, msgs);
			case FinalPackage.IFC_UNIT__IFC_MONETARY_UNIT:
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
			case FinalPackage.IFC_UNIT__IFC_DERIVED_UNIT:
				return getIfcDerivedUnit();
			case FinalPackage.IFC_UNIT__IFC_NAMED_UNIT_GROUP:
				if (coreType) return getIfcNamedUnitGroup();
				return ((FeatureMap.Internal)getIfcNamedUnitGroup()).getWrapper();
			case FinalPackage.IFC_UNIT__IFC_NAMED_UNIT:
				return getIfcNamedUnit();
			case FinalPackage.IFC_UNIT__IFC_MONETARY_UNIT:
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
			case FinalPackage.IFC_UNIT__IFC_DERIVED_UNIT:
				setIfcDerivedUnit((IfcDerivedUnit)newValue);
				return;
			case FinalPackage.IFC_UNIT__IFC_NAMED_UNIT_GROUP:
				((FeatureMap.Internal)getIfcNamedUnitGroup()).set(newValue);
				return;
			case FinalPackage.IFC_UNIT__IFC_MONETARY_UNIT:
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
			case FinalPackage.IFC_UNIT__IFC_DERIVED_UNIT:
				setIfcDerivedUnit((IfcDerivedUnit)null);
				return;
			case FinalPackage.IFC_UNIT__IFC_NAMED_UNIT_GROUP:
				getIfcNamedUnitGroup().clear();
				return;
			case FinalPackage.IFC_UNIT__IFC_MONETARY_UNIT:
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
			case FinalPackage.IFC_UNIT__IFC_DERIVED_UNIT:
				return ifcDerivedUnit != null;
			case FinalPackage.IFC_UNIT__IFC_NAMED_UNIT_GROUP:
				return ifcNamedUnitGroup != null && !ifcNamedUnitGroup.isEmpty();
			case FinalPackage.IFC_UNIT__IFC_NAMED_UNIT:
				return getIfcNamedUnit() != null;
			case FinalPackage.IFC_UNIT__IFC_MONETARY_UNIT:
				return ifcMonetaryUnit != null;
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
		result.append(" (ifcNamedUnitGroup: ");
		result.append(ifcNamedUnitGroup);
		result.append(')');
		return result.toString();
	}

} //IfcUnitImpl