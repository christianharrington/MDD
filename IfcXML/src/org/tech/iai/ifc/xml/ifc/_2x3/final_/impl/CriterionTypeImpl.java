/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CriterionType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabelType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMeasureWithUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.CriterionTypeImpl#getIfcLabel <em>Ifc Label</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.CriterionTypeImpl#getIfcMeasureWithUnit <em>Ifc Measure With Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CriterionTypeImpl extends EObjectImpl implements CriterionType {
	/**
	 * The cached value of the '{@link #getIfcLabel() <em>Ifc Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLabel()
	 * @generated
	 * @ordered
	 */
	protected IfcLabelType ifcLabel;

	/**
	 * The cached value of the '{@link #getIfcMeasureWithUnit() <em>Ifc Measure With Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMeasureWithUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcMeasureWithUnit ifcMeasureWithUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriterionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getCriterionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLabelType getIfcLabel() {
		return ifcLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLabel(IfcLabelType newIfcLabel, NotificationChain msgs) {
		IfcLabelType oldIfcLabel = ifcLabel;
		ifcLabel = newIfcLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.CRITERION_TYPE__IFC_LABEL, oldIfcLabel, newIfcLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLabel(IfcLabelType newIfcLabel) {
		if (newIfcLabel != ifcLabel) {
			NotificationChain msgs = null;
			if (ifcLabel != null)
				msgs = ((InternalEObject)ifcLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.CRITERION_TYPE__IFC_LABEL, null, msgs);
			if (newIfcLabel != null)
				msgs = ((InternalEObject)newIfcLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.CRITERION_TYPE__IFC_LABEL, null, msgs);
			msgs = basicSetIfcLabel(newIfcLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.CRITERION_TYPE__IFC_LABEL, newIfcLabel, newIfcLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getIfcMeasureWithUnit() {
		return ifcMeasureWithUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMeasureWithUnit(IfcMeasureWithUnit newIfcMeasureWithUnit, NotificationChain msgs) {
		IfcMeasureWithUnit oldIfcMeasureWithUnit = ifcMeasureWithUnit;
		ifcMeasureWithUnit = newIfcMeasureWithUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.CRITERION_TYPE__IFC_MEASURE_WITH_UNIT, oldIfcMeasureWithUnit, newIfcMeasureWithUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMeasureWithUnit(IfcMeasureWithUnit newIfcMeasureWithUnit) {
		if (newIfcMeasureWithUnit != ifcMeasureWithUnit) {
			NotificationChain msgs = null;
			if (ifcMeasureWithUnit != null)
				msgs = ((InternalEObject)ifcMeasureWithUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.CRITERION_TYPE__IFC_MEASURE_WITH_UNIT, null, msgs);
			if (newIfcMeasureWithUnit != null)
				msgs = ((InternalEObject)newIfcMeasureWithUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.CRITERION_TYPE__IFC_MEASURE_WITH_UNIT, null, msgs);
			msgs = basicSetIfcMeasureWithUnit(newIfcMeasureWithUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.CRITERION_TYPE__IFC_MEASURE_WITH_UNIT, newIfcMeasureWithUnit, newIfcMeasureWithUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.CRITERION_TYPE__IFC_LABEL:
				return basicSetIfcLabel(null, msgs);
			case FinalPackage.CRITERION_TYPE__IFC_MEASURE_WITH_UNIT:
				return basicSetIfcMeasureWithUnit(null, msgs);
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
			case FinalPackage.CRITERION_TYPE__IFC_LABEL:
				return getIfcLabel();
			case FinalPackage.CRITERION_TYPE__IFC_MEASURE_WITH_UNIT:
				return getIfcMeasureWithUnit();
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
			case FinalPackage.CRITERION_TYPE__IFC_LABEL:
				setIfcLabel((IfcLabelType)newValue);
				return;
			case FinalPackage.CRITERION_TYPE__IFC_MEASURE_WITH_UNIT:
				setIfcMeasureWithUnit((IfcMeasureWithUnit)newValue);
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
			case FinalPackage.CRITERION_TYPE__IFC_LABEL:
				setIfcLabel((IfcLabelType)null);
				return;
			case FinalPackage.CRITERION_TYPE__IFC_MEASURE_WITH_UNIT:
				setIfcMeasureWithUnit((IfcMeasureWithUnit)null);
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
			case FinalPackage.CRITERION_TYPE__IFC_LABEL:
				return ifcLabel != null;
			case FinalPackage.CRITERION_TYPE__IFC_MEASURE_WITH_UNIT:
				return ifcMeasureWithUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //CriterionTypeImpl
