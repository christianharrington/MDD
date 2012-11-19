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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMeasureWithUnit;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UnitComponentType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ValueComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Measure With Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMeasureWithUnitImpl#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMeasureWithUnitImpl#getUnitComponent <em>Unit Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMeasureWithUnitImpl extends EntityImpl implements IfcMeasureWithUnit {
	/**
	 * The cached value of the '{@link #getValueComponent() <em>Value Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComponent()
	 * @generated
	 * @ordered
	 */
	protected ValueComponentType valueComponent;

	/**
	 * The cached value of the '{@link #getUnitComponent() <em>Unit Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitComponent()
	 * @generated
	 * @ordered
	 */
	protected UnitComponentType unitComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMeasureWithUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMeasureWithUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComponentType getValueComponent() {
		return valueComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueComponent(ValueComponentType newValueComponent, NotificationChain msgs) {
		ValueComponentType oldValueComponent = valueComponent;
		valueComponent = newValueComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT, oldValueComponent, newValueComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueComponent(ValueComponentType newValueComponent) {
		if (newValueComponent != valueComponent) {
			NotificationChain msgs = null;
			if (valueComponent != null)
				msgs = ((InternalEObject)valueComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT, null, msgs);
			if (newValueComponent != null)
				msgs = ((InternalEObject)newValueComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT, null, msgs);
			msgs = basicSetValueComponent(newValueComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT, newValueComponent, newValueComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitComponentType getUnitComponent() {
		return unitComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitComponent(UnitComponentType newUnitComponent, NotificationChain msgs) {
		UnitComponentType oldUnitComponent = unitComponent;
		unitComponent = newUnitComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT, oldUnitComponent, newUnitComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitComponent(UnitComponentType newUnitComponent) {
		if (newUnitComponent != unitComponent) {
			NotificationChain msgs = null;
			if (unitComponent != null)
				msgs = ((InternalEObject)unitComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT, null, msgs);
			if (newUnitComponent != null)
				msgs = ((InternalEObject)newUnitComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT, null, msgs);
			msgs = basicSetUnitComponent(newUnitComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT, newUnitComponent, newUnitComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT:
				return basicSetValueComponent(null, msgs);
			case FinalPackage.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT:
				return basicSetUnitComponent(null, msgs);
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
			case FinalPackage.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT:
				return getValueComponent();
			case FinalPackage.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT:
				return getUnitComponent();
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
			case FinalPackage.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT:
				setValueComponent((ValueComponentType)newValue);
				return;
			case FinalPackage.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT:
				setUnitComponent((UnitComponentType)newValue);
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
			case FinalPackage.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT:
				setValueComponent((ValueComponentType)null);
				return;
			case FinalPackage.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT:
				setUnitComponent((UnitComponentType)null);
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
			case FinalPackage.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT:
				return valueComponent != null;
			case FinalPackage.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT:
				return unitComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcMeasureWithUnitImpl
